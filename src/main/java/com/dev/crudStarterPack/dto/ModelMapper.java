package com.dev.crudStarterPack.dto;
import com.dev.crudStarterPack.model.Address;
import com.dev.crudStarterPack.model.Country;
import com.dev.crudStarterPack.model.Department;
import com.dev.crudStarterPack.model.Employee;
import org.apache.commons.math3.analysis.function.Add;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


import java.util.List;

@Mapper(componentModel = "spring")
public interface ModelMapper {

    List<EmployeeDTO> employeeToDto(List<Employee> employee );


    EmployeeDTO  employeeToEmployeeDto(Employee employee  );

    Employee employeeDtoToEmployee(EmployeeDTO employeeDTO );

    List<DepartmentDTO>   departmentToDto(List<Department> departments);
    DepartmentDTO departmentToDepartmentDto(Department department);
    Department     departmentDtoToDepartment(DepartmentDTO departmentDTO);

    AddressDTO addressToAddressDto(Address address);

    Address addressDtoToAddress(AddressDTO addressDTO);

    List<CountryDTO>   countryListToCountryDTOList(List<Country> countries);





}



