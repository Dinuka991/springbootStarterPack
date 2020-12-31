package com.dev.crudStarterPack.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeDTO {

    Long id;
    String employeeName;
    String employeeMobile;
    String employeeEmail;
}
