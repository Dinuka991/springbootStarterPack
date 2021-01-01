package com.dev.crudStarterPack.controllers;


import com.dev.crudStarterPack.dto.EmployeeDTO;
import com.dev.crudStarterPack.services.impl.EmployeeServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController("/employee-services")
@RequiredArgsConstructor
@CrossOrigin
public class EmployeeController {

    @Autowired
    private final EmployeeServiceImpl employeeService;

    @GetMapping("/employee-services/all")
    ResponseEntity<List<EmployeeDTO>> all() {
        return  ResponseEntity.ok(employeeService.getAll());
    }

    @PostMapping("employee-service/add")
    public ResponseEntity<EmployeeDTO> add(@RequestBody EmployeeDTO employeeDTO ){
        EmployeeDTO createdEmployee = employeeService.addEmployee(employeeDTO);
        return ResponseEntity.created(URI.create("/users/" + createdEmployee.getEmployeeName() + "/profile")).body(createdEmployee);
    }

    @PutMapping("employee-service/update")
    public ResponseEntity<EmployeeDTO> updateEmp(@RequestBody  EmployeeDTO employeeDTO ,@RequestParam Long id)
    {
        EmployeeDTO createdEmployee = employeeService.updateEmployee(employeeDTO , id);
        return ResponseEntity.created(URI.create("/users/" + createdEmployee.getEmployeeName() + "/profile")).body(createdEmployee);
    }
}
