package com.example.microservicecloudapi.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author fengbq
 * @e-mail 2550577644@qq.com
 * @date 2022/6/17 9:25
 * @package com.example.microservicecloudapi.entity
 * @description
 */
@NoArgsConstructor
@Data// 提供类的get、set、equals、hashCode、canEqual、toString 方法
@Accessors(chain = true)
public class Dept implements Serializable {
    private Integer deptNo;
    private String deptName;
    private String dbSource;
}