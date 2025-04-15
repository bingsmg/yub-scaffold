package com.example.api.business;

import com.example.dto.UserDTO;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weibb
 */
@RestController
public class UserResource implements UserApi {

    @Override
    public UserDTO getUserById(Long id) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(id);
        userDTO.setUsername("admin");
        userDTO.setEmail("admin@example.com");
        return userDTO;
    }
}
