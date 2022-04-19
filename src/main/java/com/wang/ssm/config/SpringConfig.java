package com.wang.ssm.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @ClassName: SpringConfig
 * @Description
 * @Author:我自己
 * @Date: 2022/3/23  19:02
 * @Version 1.0
 */
@Import({MyBatisConfig.class, JdbcConfig.class})
@Configuration
@ComponentScan(basePackages = "com.wang.ssm")
@MapperScan(basePackages = "com.wang.ssm.mapper")
public class SpringConfig {
}
