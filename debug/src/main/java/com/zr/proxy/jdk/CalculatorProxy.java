package com.zr.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zhourui
 * @date 2022/1/19 19:08
 */
public class CalculatorProxy {
	public static Calculator getProxy(final Calculator calculator){
		ClassLoader classLoader = calculator.getClass().getClassLoader();
		Class<?>[] interfaces = calculator.getClass().getInterfaces();
		InvocationHandler invocationHandler = new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				Object res = null;
				res = method.invoke(calculator, args);
				return res;
			}
		};
		Object proxy = Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
		return (Calculator) proxy;
	}
}
