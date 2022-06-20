package com.example.microservicecloudproviderdepthystrix8004.service;

/**
 * @author fengbq
 * @e-mail 2550577644@qq.com
 * @date 2022/6/19 23:06
 * @package com.example.microservicecloudproviderdepthystrix8004.service
 * @description
 */
public interface DeptService {
    // hystrix 熔断器示例 ok
    public String deptInfo_Ok(Integer id);
    //hystrix 熔断器超时案例
    public String deptInfo_Timeout(Integer id);
}
