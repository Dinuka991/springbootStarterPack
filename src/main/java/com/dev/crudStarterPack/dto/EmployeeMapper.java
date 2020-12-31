package com.dev.crudStarterPack.dto;
import com.dev.crudStarterPack.model.Employee;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    List<EmployeeDTO> employeeToDto(List<Employee> employee );
}


