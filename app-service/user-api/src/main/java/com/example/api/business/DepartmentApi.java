package com.example.api.business;

import com.example.dto.DepartmentDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author weibb
 */
public interface DepartmentApi {

    @GetMapping("departments/{id}")
    DepartmentDTO getDepartmentById(@PathVariable("id") Long id);
}
