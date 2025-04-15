package com.example.feign;

import com.example.api.business.DepartmentApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author weibb
 */
@FeignClient(name = "department-service", url = Info.URL)
public interface DepartmentClient extends DepartmentApi {
}
