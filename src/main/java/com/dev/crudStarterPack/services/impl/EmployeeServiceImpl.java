package com.dev.crudStarterPack.services.impl;

import com.dev.crudStarterPack.dto.EmployeeDTO;
import com.dev.crudStarterPack.dto.EmployeeMapper;
import com.dev.crudStarterPack.model.Employee;
import com.dev.crudStarterPack.repository.EmployeeRepository;
import com.dev.crudStarterPack.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;


@RequiredArgsConstructor
@Service
public class EmployeeServiceImpl  implements EmployeeService {

    @Autowired
    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;


    @Override
    public List<EmployeeDTO> getAll() {
        List<Employee> emp = employeeRepository.findAll();
        return employeeMapper.employeeToDto(emp);
    }

    @Override
    public List<EmployeeDTO> searchEmployee(Long employeeId , String employeeName , String  employeeMobile   ) {
        List<Employee> emp =  employeeRepository.findByName(  employeeId ,  employeeName  , employeeMobile );
        return employeeMapper.employeeToDto(emp);

    }


    public EmployeeDTO addEmployee(EmployeeDTO employeeDTO) {
        Employee employee = employeeMapper.employeeDtoToEmployee(employeeDTO);
        employee.setEmployeeDate(new Date());
        Employee saveEmployee = employeeRepository.save(employee);
        return employeeMapper.employeeToEmployeeDto(saveEmployee);
    }

    public EmployeeDTO updateEmployee(EmployeeDTO employeeDTO, Long employeeId) {

        EmployeeDTO updatedEmployee = employeeRepository.findById(employeeId)
                .map(employee -> {

                    EmployeeDTO updateEmp = employeeMapper.employeeToEmployeeDto(employee);

                    updateEmp.setEmployeeName(employeeDTO.getEmployeeName());
                    updateEmp.setEmployeeDate(employeeDTO.getEmployeeDate());
                    updateEmp.setEmployeeMobile(employeeDTO.getEmployeeMobile());
                    updateEmp.setEmployeeEmail(employeeDTO.getEmployeeEmail());
                    updateEmp.setEmployeeId(employeeDTO.getEmployeeId());

                    Employee saveEmployee = employeeRepository.save(employeeMapper.employeeDtoToEmployee(updateEmp));
                    return employeeMapper.employeeToEmployeeDto(saveEmployee);

                })
                .orElseGet(() -> {
                    Employee employee = employeeMapper.employeeDtoToEmployee(employeeDTO);
                    Employee saveEmployee = employeeRepository.save(employee);
                    return employeeMapper.employeeToEmployeeDto(saveEmployee);

                });


        return updatedEmployee;
    }



}




