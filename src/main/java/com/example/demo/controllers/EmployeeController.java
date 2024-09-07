package com.example.demo.controllers;


import com.example.demo.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
//@RequestMapping("/employees")
public class EmployeeController {

    @GetMapping(path = "/msg")
    public String getMsg(){
        return "Hello World!!";
    }

    @GetMapping(path="/employees/{employeeID}")
    public String getEmployee(@PathVariable Long employeeID){

        EmployeeDTO obj= new EmployeeDTO(employeeID, "Anand","anand@gmail.com",21, LocalDate.of(2024,2,1),true);
        System.out.println(obj);
        return obj.toString();
    }

    @GetMapping("/employees")
    public String getAllEmployees(@RequestParam Integer age,
                                  @RequestParam(required = false) String sortBy){
        return "Hi age: "+age + "sortby: "+sortBy;

    }


    @PostMapping("/employees")
    public EmployeeDTO addEmployee(@RequestBody EmployeeDTO newEmployee){
        newEmployee.setId(123L);
        return newEmployee;
    }







}
