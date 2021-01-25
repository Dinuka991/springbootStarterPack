package com.dev.crudStarterPack.services;

import com.dev.crudStarterPack.dto.EmployeeDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface EmployeeService {

    List<EmployeeDTO> getAll();

    List<EmployeeDTO> searchEmployee(Long employeeId, String employeeName, String employeeMobile);

    EmployeeDTO  addEmployee(EmployeeDTO employeeDTO);

    EmployeeDTO updateEmployee(EmployeeDTO employeeDTO , Long employeeId);
}