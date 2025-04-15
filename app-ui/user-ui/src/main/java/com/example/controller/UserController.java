package com.example.controller;
import com.example.dto.UserDTO;
import com.example.feign.UserClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weibb
 */
@RestController
@RequestMapping("users")
@RequiredArgsConstructor
public class UserController {

    private final UserClient userClient;

    @GetMapping("{id}")
    public UserDTO getUser(@PathVariable Long id) {
        return userClient.getUserById(id);
    }
}
