package com.dev.crudStarterPack.controllers;
import com.dev.crudStarterPack.dto.EmployeeDTO;
import com.dev.crudStarterPack.services.EmployeeService;
import com.dev.crudStarterPack.services.impl.EmployeeServiceImpl;
import lombok.RequiredArgsConstructor;
import org.apache.commons.compress.utils.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URI;
import java.util.List;

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

    @GetMapping("/download/employee.xlsx")
    public  void downloadCsv(HttpServletResponse response) throws IOException{
        response.setContentType("application/octet-stream");
        response.setHeader("Content-Disposition", "attachment;filename=employee.xlsx");
        ByteArrayInputStream stream = employeeService.EmployeeListToExcel(employeeService.getAll());
        IOUtils.copy(stream, response.getOutputStream());
    }

}
