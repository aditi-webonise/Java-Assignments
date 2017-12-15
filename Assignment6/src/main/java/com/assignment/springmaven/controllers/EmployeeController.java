package com.assignment.springmaven.controllers;

import com.assignment.springmaven.model.Employee;
import com.assignment.springmaven.service.EmployeeServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
public class EmployeeController {

    private EmployeeServiceImpl employeeService;

    public void setEmployeeService(EmployeeServiceImpl employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping(value = "/addEmployee")
    public ModelAndView showForm() {
        return new ModelAndView("/addEmployee","command",new Employee());
    }

    @RequestMapping(value="/save",method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("employee") Employee employee) throws Exception {
        employeeService.save(employee);
        return new ModelAndView("redirect:/viewEmployees");
    }

    @RequestMapping(value = "/viewEmployees",method = RequestMethod.GET)
    public ModelAndView viewEmployees() throws Exception {
        List<Employee> list=employeeService.getEmployees();
        ModelAndView modelAndView = new ModelAndView("/viewEmployees");
        modelAndView.addObject("list",list);
        return modelAndView;
    }

    @RequestMapping(value="/editEmployee/{id}")
    public ModelAndView editEmployee(@PathVariable int id) throws Exception {
        Employee employee = employeeService.getEmpById(id);
        return new ModelAndView("/editEmployee","command",employee);
    }

    @RequestMapping(value="/editSave",method = RequestMethod.POST)
    public ModelAndView editSave(@ModelAttribute("employee") Employee employee) throws Exception {
        employeeService.update(employee);
        return new ModelAndView("redirect:/viewEmployees");
    }

    @RequestMapping(value="/deleteEmployee/{id}")
    public ModelAndView deleteEmployee(@PathVariable int id) throws Exception {
        employeeService.delete(id);
        return new ModelAndView("redirect:/viewEmployees");
    }
}