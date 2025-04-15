package com.example.controller;

import com.example.dto.DepartmentDTO;
import com.example.feign.DepartmentClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weibb
 */
@RestController
@RequestMapping("departments")
@RequiredArgsConstructor
public class DepartmentController {

    private final DepartmentClient departmentClient;

    @GetMapping("{id}")
    public DepartmentDTO getDepartment(@PathVariable Long id) {
        return departmentClient.getDepartmentById(id);
    }
}
