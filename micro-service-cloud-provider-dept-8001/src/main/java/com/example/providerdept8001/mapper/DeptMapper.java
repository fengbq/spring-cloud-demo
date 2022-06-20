package com.example.providerdept8001.mapper;

import com.example.microservicecloudapi.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author fengbq
 * @e-mail 2550577644@qq.com
 * @date 2022/6/17 9:54
 * @package com.example.providerdept8001.mapper
 * @description
 */
@Mapper
public interface DeptMapper {
    //根据主键获取数据
    Dept selectByPrimaryKey(Integer deptNo);
    //获取表中的全部数据
    List<Dept> GetAll();
}
