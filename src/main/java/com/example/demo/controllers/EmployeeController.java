package com.example.demo.controllers;


import com.example.demo.dto.EmployeeDTO;
import com.example.demo.models.EmployeeModel;
import com.example.demo.repositories.EmployeeRepository;
import com.example.demo.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
//@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @GetMapping(path = "/msg")
    public String getMsg(){
        return "Hello World!!";
    }

    @GetMapping(path="/employees/{employeeID}")
    public Optional<EmployeeModel> getEmployee(@PathVariable Long employeeID){
        return employeeRepository.findById(employeeID);
    }

    @GetMapping("/employees")
    public List<EmployeeModel> getAllEmployees(@RequestParam(required = false) String sortBy){
        return employeeRepository.findAll();
    }


    @PostMapping("/employees")
    public EmployeeModel addEmployee(@RequestBody EmployeeModel newEmployee){
        return employeeRepository.save(newEmployee);
    }







}
