package com.spring.boot.controller;

import com.spring.boot.model.Department;
import com.spring.boot.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    DepartmentRepository departmentRepository;

    @GetMapping("/")
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    @PostMapping("/")
    public Department createDepartment(@Valid @RequestBody Department department) {
        return departmentRepository.save(department);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable(value = "id") Long id) {
        Department department = departmentRepository.findOne(id);
        if(department == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(department);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Department> updateDepartment(@PathVariable(value = "id") Long id,
                                                   @Valid @RequestBody Department departmentDetails) {
        Department department = departmentRepository.findOne(id);
        if(department == null) {
            return ResponseEntity.notFound().build();
        }
        department.setName(departmentDetails.getName());
        Department updatedDepartment = departmentRepository.save(department);
        return ResponseEntity.ok(updatedDepartment);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Department> deleteDepartment(@PathVariable(value = "id") Long id) {
        Department department = departmentRepository.findOne(id);
        if(department == null) {
            return ResponseEntity.notFound().build();
        }
        departmentRepository.delete(department);
        return ResponseEntity.ok().build();
    }
} 