package com.zr.aop;

import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Arrays;

/**
 * 当前spring版本5.2.x (x<5)
 *
 * aop执行顺序:
 * 正常：around-before -> before -> target -> around-after -> after -> after-returning
 * 异常：around-before -> before -> target -> after -> after-throwing
 *
 * @author zhourui
 * @date 2022/1/18 9:22
 */
//@Aspect
//@Component
public class LogUtil {


//	@Pointcut(value = "execution(* com.zr.aop..*.*(..))")
	public void myPointCut() {

	}

//	@Before(value = "myPointCut()")
	public void beforeCalculate() {
		System.err.println("before calculate");
	}

//	@After(value = "myPointCut()")
	public void afterCalculate() {
		System.err.println("after calculate");
	}

//	@Around(value = "myPointCut()", argNames = "joinPoint")
	public Object aroundCalculate(ProceedingJoinPoint joinPoint) throws Throwable {
		System.err.println("around calculate1");
		Object obj = joinPoint.proceed();
		System.err.println("around calculate2");
		return obj;
	}

//	@AfterReturning("myPointCut()")
	public void afterReturningCalculate() {
		System.err.println("afterReturning calculate");
	}

//	@AfterThrowing
	public void afterThrowingCalculate() {
		System.err.println("afterThrowing calculate");
	}

}
