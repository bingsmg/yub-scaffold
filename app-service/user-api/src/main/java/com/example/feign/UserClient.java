package com.example.feign;

import com.example.api.business.UserApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author weibb
 */
@FeignClient(name = "user-service", url = Info.URL)
public interface UserClient extends UserApi {
}
