package com.example.Application;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Employees")
public class EmployeeController {

    @GetMapping
    public String getEmployee() {
        return "Get Employee was called";
    }

    @PostMapping
    public String createEmployee(){
        return  "Create Employee was called";
    }

    @PutMapping
    public String updateEmployee(){
        return "Update Employee was called";
    }
    @DeleteMapping
    public String deleteEmployee(){
        return "Delete Employee was called";
    }
}

