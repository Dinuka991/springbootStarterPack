package com.dev.crudStarterPack.controllers;

import com.dev.crudStarterPack.dto.DepartmentDTO;
import com.dev.crudStarterPack.services.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/department-service")


public class DepartmentController {

    private  final DepartmentService departmentService;

    @GetMapping("/getAllDep")
    ResponseEntity<List<DepartmentDTO>>  all (){
        return  ResponseEntity.ok(departmentService.getAll());
    }
}
