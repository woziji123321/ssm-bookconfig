package com.wang.ssm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @ClassName: SpringMvcConfig
 * @Description
 * @Author:我自己
 * @Date: 2022/3/23  19:05
 * @Version 1.0
 */
@Configuration
@ComponentScan(basePackages = "com.wang.ssm")
@EnableWebMvc
public class SpringMvcConfig implements WebMvcConfigurer {

    /**
     * 视图解析器
     *
     * @param registry
     */
    public void configureViewResolvers(ViewResolverRegistry registry) {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/");
        viewResolver.setSuffix(".jsp");
        registry.viewResolver(viewResolver);
    }

    /**
     * 静态资源
     * 相当于 <mvc:default-servlet-handler/>  将SpringMVC处理不了的请求交给tomcat;静态资源
     *
     * @param configurer
     */
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    /**
     * 拦截器
     *
     * @param registry
     */
    public void addInterceptors(InterceptorRegistry registry) {

    }

}
