package com.dev.crudStarterPack.dto;
import com.dev.crudStarterPack.model.Department;
import com.dev.crudStarterPack.model.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


import java.util.List;

@Mapper(componentModel = "spring")
public interface ModelMapper {

    List<EmployeeDTO> employeeToDto(List<Employee> employee );

    @Mapping( target = "departmentId", source = "department.departmentId" )
    EmployeeDTO  employeeToEmployeeDto(Employee employee  );

    @Mapping( target = "department.departmentId", source = "departmentId" )
    Employee employeeDtoToEmployee(EmployeeDTO employeeDTO );

    List<DepartmentDTO>   departmentToDto(List<Department> departments);
    DepartmentDTO departmentToDepartmentDto(Department department);
    Department     departmentDtoToDepartment(DepartmentDTO departmentDTO);



}


