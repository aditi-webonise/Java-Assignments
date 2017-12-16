package com.assignment.springmaven.dao;

import com.assignment.springmaven.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class EmployeeDao {

    @Autowired
    private JdbcTemplate template;

    public int saveEmployee(Employee employee) {
        String sql="INSERT INTO employees (name,contact,email,blood_group)" +
                "VALUES ('"+employee.getName()+"',"+employee.getContact()+"," +
                "'"+employee.getEmail()+"','"+employee.getBloodGroup()+"')";
        return template.update(sql);
    }

    public int updateEmployee(Employee employee) {
        String sql="UPDATE employees SET name='"+employee.getName()+"', contact="+employee.getContact()+"," +
                "email='"+employee.getEmail()+"',blood_group='"+employee.getBloodGroup()+"' where id="+employee.getId();
        return template.update(sql);
    }

    public  int deleteEmployee(int id) {
        String sql="DELETE FROM employees where id="+id;
        return template.update(sql);
    }

    public Employee getEmpById(int id) {
        String sql="SELECT * FROM employees where id=?";
        return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Employee>(Employee.class));
    }

    public List<Employee> getEmployees() {
        return template.query("SELECT * FROM employees",new RowMapper<Employee>() {
            public Employee mapRow(ResultSet rs, int row) throws SQLException {
                Employee employee =new Employee();
                employee.setId(rs.getInt(1));
                employee.setName(rs.getString(2));
                employee.setContact(rs.getLong(3));
                employee.setEmail(rs.getString(4));
                employee.setBloodGroup(rs.getString(5));
                return employee;
            }
        });
    }
} 