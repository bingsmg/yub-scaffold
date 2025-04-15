package com.example.api.business;

import com.example.dto.UserDTO;
import com.example.param.UserQueryParam;
import org.springframework.cloud.openfeign.FeignClient;

import java.util.List;

/**
 * @author weibb
 */
//@FeignClient(name = Info.NAME, path = Info.JAX_RS_PATH, url = Info.URL, contextId = Info.CONTEXT_ID, primary = false)
//@Consumes({MediaType.APPLICATION_JSON})
//@Produces({MediaType.APPLICATION_JSON})
//@Path("user")
//public interface UserService {
//
//    @POST
//    UserDTO saveUser(UserDTO user);
//
//    /**
//     * 根据 ID 获取用户信息
//     * @param id 用户标识
//     * @return 用户信息
//     */
//    @GET
//    @Path("{id}")
//    UserDTO getUserById(@PathParam("id") Long id);
//
//    @GET
//    @Path("/list")
//    List<UserDTO> listUsers(@BeanParam UserQueryParam param);
//
//    @PUT
//    @Path("/{id}")
//    UserDTO updateUser(@PathParam("id") Long id, UserDTO user);
//
//    @DELETE
//    @Path("/{id}")
//    void removeUser(@PathParam("id") Long id);
//}
