package com.assignment.springmaven.controllers;

import com.assignment.springmaven.model.Employee;
import com.assignment.springmaven.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeService;

    @RequestMapping(value = "/add")
    public ModelAndView showForm() {
        return new ModelAndView("/add","command",new Employee());
    }

    @RequestMapping(value="/save",method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("employee") Employee employee) throws Exception {
        employeeService.save(employee);
        return new ModelAndView("redirect:/view");
    }

    @RequestMapping(value = "/view")
    public ModelAndView viewEmployees() throws Exception {
        List<Employee> list=employeeService.getEmployees();
        ModelAndView modelAndView = new ModelAndView("/view");
        modelAndView.addObject("list",list);
        return modelAndView;
    }

    @RequestMapping(value="/fetch/{id}")
    public ModelAndView editEmployee(@PathVariable int id) throws Exception {
        Employee employee = employeeService.getEmpById(id);
        return new ModelAndView("/edit","command",employee);
    }

    @RequestMapping(value="/update",method = RequestMethod.POST)
    public ModelAndView updateEmployee(@ModelAttribute("employee") Employee employee) throws Exception {
        employeeService.update(employee);
        return new ModelAndView("redirect:/view");
    }

    @RequestMapping(value="/delete/{id}")
    public ModelAndView deleteEmployee(@PathVariable int id) throws Exception {
        employeeService.delete(id);
        return new ModelAndView("redirect:/view");
    }
}