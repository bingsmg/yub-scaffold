package com.example.api.business;

import com.example.dto.UserDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author weibb
 */
public interface UserApi {

    @GetMapping("users/{id}")
    UserDTO getUserById(@PathVariable("id") Long id);
}
