package com.dev.crudStarterPack.repository;

import com.dev.crudStarterPack.dto.EmployeeDTO;
import com.dev.crudStarterPack.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {



    @Query("select e from Employee e where e.employeeId like %?1%")
    EmployeeDTO findByEmployeeId(Long employeeId);

}
