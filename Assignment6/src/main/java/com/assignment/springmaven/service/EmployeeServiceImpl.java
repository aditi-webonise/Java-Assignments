package com.assignment.springmaven.service;

import com.assignment.springmaven.dao.EmployeeDao;
import com.assignment.springmaven.model.Employee;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDao employeeDao;

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

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
