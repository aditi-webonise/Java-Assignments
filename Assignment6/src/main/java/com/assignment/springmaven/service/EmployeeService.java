package com.assignment.springmaven.service;

import com.assignment.springmaven.model.Employee;
import java.util.List;

public interface EmployeeService {

    /*
    Saves employee details into database
     */
    public int save(Employee employee) throws Exception;
    public int update(Employee employee)throws Exception;
    public int delete(int id) throws Exception;
    public Employee getEmpById(int id) throws Exception;
    public List<Employee> getEmployees() throws Exception;
}
