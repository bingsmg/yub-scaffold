package com.example.api.business;

import com.example.dto.DepartmentDTO;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weibb
 */
@RestController
public class DepartmentResource implements DepartmentApi {

    @Override
    public DepartmentDTO getDepartmentById(Long id) {
        DepartmentDTO departmentDTO = new DepartmentDTO();
        departmentDTO.setId(100L);
        departmentDTO.setName("Department demo");
        return departmentDTO;
    }
}
