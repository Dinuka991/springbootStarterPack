package com.dev.crudStarterPack.services.impl;
import com.dev.crudStarterPack.dto.EmployeeDTO;
import com.dev.crudStarterPack.dto.EmployeeMapper;
import com.dev.crudStarterPack.model.Employee;
import com.dev.crudStarterPack.repository.EmployeeRepository;
import com.dev.crudStarterPack.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.PageRequest;
import java.util.Date;
import java.util.List;

@RequiredArgsConstructor
@Service
public class EmployeeServiceImpl  implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;


    @Override
    public List<EmployeeDTO> getAll() {
        List<Employee> emp = employeeRepository.findAll();
        return employeeMapper.employeeToDto(emp);
    }

    @Override
    public Page<Employee> searchEmployee(Long employeeId , String employeeName , String  employeeMobile , int first , int maxResult) {
     return employeeRepository.findByName(  employeeId ,  employeeName  , employeeMobile , PageRequest.of( first , maxResult )  );
    }

    @Override
    public EmployeeDTO addEmployee(EmployeeDTO employeeDTO) {
        Employee employee = employeeMapper.employeeDtoToEmployee(employeeDTO);
        employee.setEmployeeDate(new Date());
        Employee saveEmployee = employeeRepository.save(employee);
        return employeeMapper.employeeToEmployeeDto(saveEmployee);
    }


}




