package com.dev.crudStarterPack.services;
import com.dev.crudStarterPack.dto.DepartmentDTO;
import org.springframework.stereotype.Service;
import java.util.List;


public interface DepartmentService {
    List<DepartmentDTO> getAll();
}
