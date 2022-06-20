package com.example.providerdept8001.service;

import com.example.microservicecloudapi.entity.Dept;

import java.util.List;

/**
 * @author fengbq
 * @e-mail 2550577644@qq.com
 * @date 2022/6/17 9:59
 * @package com.example.providerdept8001.service
 * @description
 */
public interface DeptService {
    Dept get(Integer deptNo);
    List<Dept> selectAll();
}
