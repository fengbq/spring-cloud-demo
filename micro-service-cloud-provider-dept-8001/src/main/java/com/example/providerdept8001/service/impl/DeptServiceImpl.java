package com.example.providerdept8001.service.impl;

import com.example.microservicecloudapi.entity.Dept;
import com.example.providerdept8001.mapper.DeptMapper;
import com.example.providerdept8001.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author fengbq
 * @e-mail 2550577644@qq.com
 * @date 2022/6/17 9:59
 * @package com.example.providerdept8001.service.impl
 * @description
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public Dept get(Integer deptNo) {
        return deptMapper.selectByPrimaryKey(deptNo);
    }

    @Override
    public List<Dept> selectAll() {
        return deptMapper.GetAll();
    }
}
