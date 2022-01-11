package com.zr.selfannotation;

import java.lang.annotation.*;

/**
 * 仿写Spring @Autowired注解
 *
 * @author zhourui
 * @date 2022/1/11 13:27
 */
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyAutowired {

	boolean required() default true;
}
