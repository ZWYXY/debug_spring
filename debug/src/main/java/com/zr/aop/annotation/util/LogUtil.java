package com.zr.aop.annotation.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.util.PartialOrder;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 当前spring版本5.2.x (x<5)
 *
 * aop执行顺序:
 * 正常：around-before -> before -> target -> around-after -> after -> after-returning
 * 异常：around-before -> before -> target -> after -> after-throwing
 * 上面这个执行流程中（before和around around和after 它们之间的的执行顺序）并不一定固定 {@link org.aspectj.util.PartialOrder} 取决于这里topo-sort的结果
 * 但是通常是上面这个流程 查找方法sortAdvisors() -> 子类实现 ->
 * {@link org.springframework.aop.aspectj.autoproxy.AspectJAwareAdvisorAutoProxyCreator.PartiallyComparableAdvisorHolder}
 * {@link PartialOrder.PartialComparable}
 * @see org.aspectj.util.PartialOrder
 *
 * @author zhourui
 * @date 2022/1/18 9:22
 */
@Order
@Aspect
@Component
public class LogUtil {

	@Pointcut(value = "execution(public * com.zr.aop.annotation..*(..))")
	public void myPointCut() {}

	@Before(value = "myPointCut()")
	public void beforeCalculate(JoinPoint joinPoint) {
		System.err.println("before calculate");
	}

	// logFinally
	@After(value = "myPointCut()")
	public void afterCalculate(JoinPoint joinPoint) {
		System.err.println("after calculate");
	}

	@Around(value = "myPointCut()", argNames = "joinPoint")
	public Object aroundCalculate(ProceedingJoinPoint joinPoint) throws Throwable {
		System.err.println("around calculate1");
		Object[] args = joinPoint.getArgs();
		Object obj = joinPoint.proceed(args);
//		Object obj = joinPoint.proceed();
		System.err.println("around calculate2");
		return obj;
	}

	@AfterReturning(value = "myPointCut()", returning = "result")
	public void afterReturningCalculate(JoinPoint joinPoint, Object result) {
		System.err.println("afterReturning calculate");
	}

	// logException
	@AfterThrowing(value = "myPointCut()", throwing = "ex")
	public void afterThrowingCalculate(JoinPoint joinPoint, Throwable ex) {
		System.err.println("afterThrowing calculate");
	}

}
