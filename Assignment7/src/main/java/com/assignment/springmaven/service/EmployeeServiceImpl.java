package com.assignment.springmaven.service;

import com.assignment.springmaven.dao.EmployeeDao;
import com.assignment.springmaven.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    public int save(Employee employee) throws Exception {
        try{
            return employeeDao.saveEmployee(employee);
        } catch (Exception ex) {
            System.out.println("Error in saving employee details..");
            throw ex;
        }
    }

    public int update(Employee employee) throws Exception {
        try{
            return employeeDao.updateEmployee(employee);
        } catch (Exception ex) {
            System.out.println("Error while updating employee details..");
            throw ex;
        }
    }

    public int delete(int id) throws Exception {
        try{
            return employeeDao.deleteEmployee(id);
        } catch (Exception ex) {
            System.out.println("Error in deleting employee details ..");
            throw ex;
        }
    }

    public Employee getEmpById(int id) throws Exception{
        try{
            return employeeDao.getEmpById(id);
        } catch (Exception ex) {
            System.out.println("Error while fetching employee..");
            throw ex;
        }

    }

    public List<Employee> getEmployees() throws Exception{
        try{
            return employeeDao.getEmployees();
        } catch (Exception ex) {
            System.out.println("Error while listing employees..");
            throw ex;
        }

    }
}
