package com.zr.aop.annotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author zhourui
 * @date 2022/1/21 11:21
 */
@Configuration
@ComponentScan(basePackages = "com.zr.aop.annotation")
@EnableAspectJAutoProxy
public class SpringConfig {

}
