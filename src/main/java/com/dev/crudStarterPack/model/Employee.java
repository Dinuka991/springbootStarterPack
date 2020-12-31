package com.dev.crudStarterPack.model;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "EmployeeM")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long employeeId;
    String employeeName;
    String employeeMobile;
    String employeeEmail;
    @JsonFormat(pattern="yyyy-MM-dd")
    Date employeeDate;
}