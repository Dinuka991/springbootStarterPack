package com.dev.crudStarterPack.services;
import com.dev.crudStarterPack.dto.EmployeeDTO;
import com.dev.crudStarterPack.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.util.List;

@Service
public interface EmployeeService {

    List<EmployeeDTO> getAll();

    Page<Employee> searchEmployee(Long employeeId, String employeeName, String employeeMobile , int first , int maxResult );

    EmployeeDTO  addEmployee(EmployeeDTO employeeDTO);

    ByteArrayInputStream EmployeeListToExcel(List<EmployeeDTO> employeeDTOList);
}