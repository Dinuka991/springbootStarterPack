package com.dev.crudStarterPack.controllers;
import com.dev.crudStarterPack.dto.EmployeeDTO;
import com.dev.crudStarterPack.services.EmployeeService;
import com.dev.crudStarterPack.services.impl.EmployeeServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee-services")
@RequiredArgsConstructor
@CrossOrigin
public class EmployeeController {


    private final EmployeeService employeeService;

    @GetMapping("/all")
    ResponseEntity<List<EmployeeDTO>> all() {
        return  ResponseEntity.ok(employeeService.getAll());
    }

    @GetMapping("/search")
    ResponseEntity<List<EmployeeDTO>> search(@RequestParam  (required = false ) Long employeeId ,
                                             @RequestParam  (required = false )String employeeName ,
                                              @RequestParam  (required = false )String employeeMobile){
        return  ResponseEntity.ok(employeeService.searchEmployee( employeeId , employeeName , employeeMobile));
    }

    @PutMapping("/add")
    public ResponseEntity<EmployeeDTO> add(@RequestBody EmployeeDTO employeeDTO ){
        EmployeeDTO createdEmployee = employeeService.addEmployee(employeeDTO);
        return ResponseEntity.created(URI.create("/users/" + createdEmployee.getEmployeeName() + "/profile")).body(createdEmployee);
    }

    @PutMapping("employees/{id}")
    public ResponseEntity<EmployeeDTO> updateEmp(@RequestBody  EmployeeDTO employeeDTO ,@PathVariable Long id)
    {
        EmployeeDTO createdEmployee = employeeService.updateEmployee(employeeDTO , id);
        return ResponseEntity.created(URI.create("/users/" + createdEmployee.getEmployeeName() + "/profile")).body(createdEmployee);
    }

}
