package com.dev.crudStarterPack.controllers;


import com.dev.crudStarterPack.dto.EmployeeDTO;
import com.dev.crudStarterPack.model.Employee;
import com.dev.crudStarterPack.services.impl.EmployeeServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/employee-services")
@RequiredArgsConstructor
@CrossOrigin
public class EmployeeController {

    @Autowired
    private final EmployeeServiceImpl employeeService;

    @GetMapping("/employee-services/psearch")
    ResponseEntity<List<EmployeeDTO>> all() {
        return  ResponseEntity.ok(employeeService.getAll());
    }



}
