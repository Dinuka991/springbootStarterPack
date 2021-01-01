package com.dev.crudStarterPack.services;

import com.dev.crudStarterPack.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeService {

    List<EmployeeDTO> getAll();

    EmployeeDTO  addEmployee(EmployeeDTO employeeDTO);

    public EmployeeDTO updateEmployee(EmployeeDTO employeeDTO , Long employeeId);
}