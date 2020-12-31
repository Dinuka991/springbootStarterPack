package com.dev.crudStarterPack.services.impl;

import com.dev.crudStarterPack.dto.EmployeeDTO;
import com.dev.crudStarterPack.dto.EmployeeMapper;
import com.dev.crudStarterPack.model.Employee;
import com.dev.crudStarterPack.repository.EmployeeRepository;
import com.dev.crudStarterPack.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class EmployeeServiceImpl  implements EmployeeService {

    @Autowired
    private final EmployeeRepository employeeRepository;
    private  final EmployeeMapper employeeMapper;


    @Override
    public List<EmployeeDTO> getAll() {
        List<Employee> emp =  employeeRepository.findAll();
        return  employeeMapper.employeeToDto(emp);
    }

}




