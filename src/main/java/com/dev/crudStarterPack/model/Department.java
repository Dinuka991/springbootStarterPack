package com.dev.crudStarterPack.model;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "DepartmentD1")
@Entity
@Data
public class Department {

    @Id
    Long departmentId;
    String departmentName;
    String departmentHead;
}
