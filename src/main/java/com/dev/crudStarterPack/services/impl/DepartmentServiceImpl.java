package com.dev.crudStarterPack.services.impl;

import com.dev.crudStarterPack.dto.DepartmentDTO;
import com.dev.crudStarterPack.dto.EmployeeMapper;
import com.dev.crudStarterPack.model.Department;
import com.dev.crudStarterPack.repository.DepartmentRepository;
import com.dev.crudStarterPack.services.DepartmentService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DepartmentServiceImpl  implements DepartmentService {

    private  final DepartmentRepository departmentRepository;
    private  final EmployeeMapper employeeMapper;
    @Override
    public List<DepartmentDTO> getAll() {
        List<Department> dep =  departmentRepository.findAll();
        return   employeeMapper.departmentToDto(dep);
    }
}
