package com.learningspringboot.springboot.tutorial.controller;

import com.learningspringboot.springboot.tutorial.entity.Department;
import com.learningspringboot.springboot.tutorial.error.DepartmentNotFoundException;
import com.learningspringboot.springboot.tutorial.service.DepartmentService;
import com.learningspringboot.springboot.tutorial.service.DepartmentServiceImpl;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    private final Logger logger= LoggerFactory.getLogger(DepartmentController.class);
    @PostMapping("/departments")
    public Department saveDepartment(@Valid  @RequestBody Department department){
        logger.info("Inside save department");
        return departmentService.saveDepartment(department);
    }
    @GetMapping("/departments")
    public List<Department> fetchDepartmentList(){
        logger.info("Inside fetch department");
        return departmentService.fetchDepartementList();
    }
    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId) throws DepartmentNotFoundException {
        return departmentService.fetchDepartmentById(departmentId);
    }
    @DeleteMapping("departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId){
        departmentService.deleteDepartmentById(departmentId);
        return "Department deleted successfully...";

    }
    @PutMapping("departments/{id}")
    public Department updateDepartment(@PathVariable Long departmentId,@RequestBody Department department){
        return departmentService.updateDepartment(departmentId,department);
    }
    @GetMapping("departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable String departmentName){
        return departmentService.fetchDepartmentByName(departmentName);
    }


}
