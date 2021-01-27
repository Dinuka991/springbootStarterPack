package com.dev.crudStarterPack.model;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Department {

    @Id
    Long departmentId;
    String departmentName;
    String departmentHead;
}
