package com.assignment.springmaven.service;

import com.assignment.springmaven.model.Employee;
import java.util.List;

public interface EmployeeService {

    /*
         Saves employee details into database
    */
    public int save(Employee employee) throws Exception;

    /*
        Updates employee details in database
    */
    public int update(Employee employee)throws Exception;

    /*
        Deletes employee details from database
    */
    public int delete(int id) throws Exception;

    /*
        Fetches details of the employee with matching id from database
    */
    public Employee getEmpById(int id) throws Exception;

    /*
        Fetches details of all the employees from database
    */
    public List<Employee> getEmployees() throws Exception;
}
