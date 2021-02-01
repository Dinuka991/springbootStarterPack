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
    @Mapping( target = "departmentName", source = "department.departmentName" )
    @Mapping( target = "departmentHead", source = "department.departmentHead" )
    EmployeeDTO  employeeToEmployeeDto(Employee employee  );

    @Mapping( target = "department.departmentName", source = "departmentName" )
    @Mapping( target = "department.departmentId", source = "departmentId" )
    @Mapping( target = "department.departmentHead", source = "departmentHead" )
    Employee employeeDtoToEmployee(EmployeeDTO employeeDTO );

    List<DepartmentDTO>   departmentToDto(List<Department> departments);
    DepartmentDTO departmentToDepartmentDto(Department department);
    Department     departmentDtoToDepartment(DepartmentDTO departmentDTO);



}



