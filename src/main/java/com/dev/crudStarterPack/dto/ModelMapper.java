package com.dev.crudStarterPack.dto;
import com.dev.crudStarterPack.model.Department;
import com.dev.crudStarterPack.model.Employee;
import org.mapstruct.Mapper;


import java.util.List;

@Mapper(componentModel = "spring")
public interface ModelMapper {

    List<EmployeeDTO> employeeToDto(List<Employee> employee );
    EmployeeDTO  employeeToEmployeeDto(Employee employee);
    Employee employeeDtoToEmployee(EmployeeDTO employeeDTO);

    List<DepartmentDTO>   departmentToDto(List<Department> departments);
    DepartmentDTO departmentToDepartmentDto(Department department);
    Department     departmentDtoToDepartment(DepartmentDTO departmentDTO);

}


