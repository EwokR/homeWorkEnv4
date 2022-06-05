package com.example.homeworkenv4.controller;

import com.example.homeworkenv4.Employee;
import com.example.homeworkenv4.Service.EmployeeService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class FirstController {

    private final EmployeeService employeeService;

    public FirstController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(value = "/add", produces = MediaType.APPLICATION_JSON_VALUE)
    public Employee addEmployee(@RequestParam String name, @RequestParam String secondName) {
        return employeeService.addEmployee(name, secondName);
    }

    @GetMapping(value = "/delete", produces = MediaType.APPLICATION_JSON_VALUE)
    public Employee deleteEmployee(@RequestParam String name, @RequestParam String secondName) {
        return employeeService.deleteEmployee(name, secondName);
    }

    @GetMapping(value = "/find", produces = MediaType.APPLICATION_JSON_VALUE)
    public Employee findEmployee(@RequestParam String name, @RequestParam String secondName) {
        return employeeService.findEmployee(name, secondName);
    }

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Employee> getAll() {
        return employeeService.getAll();
    }
}
