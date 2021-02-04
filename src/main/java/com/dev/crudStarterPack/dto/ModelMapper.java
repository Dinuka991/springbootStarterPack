package com.dev.crudStarterPack.dto;
import com.dev.crudStarterPack.model.Address;
import com.dev.crudStarterPack.model.Department;
import com.dev.crudStarterPack.model.Employee;
import org.apache.commons.math3.analysis.function.Add;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


import java.util.List;

@Mapper(componentModel = "spring")
public interface ModelMapper {

    List<EmployeeDTO> employeeToDto(List<Employee> employee );

    @Mapping( target = "departmentId", source = "department.departmentId" )
    @Mapping( target = "departmentName", source = "department.departmentName" )
    @Mapping( target = "departmentHead", source = "department.departmentHead" )
    @Mapping( target = "line1", source = "address.line1" )
    @Mapping( target = "city", source = "address.city" )
    @Mapping( target = "country", source = "address.country" )
    @Mapping( target = "addressId", source = "address.addressId" )
    EmployeeDTO  employeeToEmployeeDto(Employee employee  );

    @Mapping( target = "department.departmentName", source = "departmentName" )
    @Mapping( target = "department.departmentId", source = "departmentId" )
    @Mapping( target = "department.departmentHead", source = "departmentHead" )
    @Mapping( target = "address.line1", source = "line1" )
    @Mapping( target = "address.city", source = "city" )
    @Mapping( target = "address.country", source = "country" )
    @Mapping( target = "address.addressId", source = "addressId" )
    Employee employeeDtoToEmployee(EmployeeDTO employeeDTO );

    List<DepartmentDTO>   departmentToDto(List<Department> depzAartments);
    DepartmentDTO departmentToDepartmentDto(Department department);
    Department     departmentDtoToDepartment(DepartmentDTO departmentDTO);

    @Mapping( target = "employeeId", source = "employee.employeeId" )
    AddressDTO addressToAddressDto(Address address);

    @Mapping( target = "employee.employeeId", source = "employeeId" )
    Address addressDtoToAddress(AddressDTO addressDTO);




}



