package com.dev.crudStarterPack.services;

import com.dev.crudStarterPack.dto.EmployeeDTO;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.util.List;

@Service
public interface EmployeeService {

    List<EmployeeDTO> getAll();

    EmployeeDTO  addEmployee(EmployeeDTO employeeDTO);

    EmployeeDTO updateEmployee(EmployeeDTO employeeDTO , Long employeeId);

    ByteArrayInputStream EmployeeListToExcel(List<EmployeeDTO> employeeDTOList);
}