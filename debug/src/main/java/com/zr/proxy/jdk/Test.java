package com.zr.proxy.jdk;

/**
 * @author zhourui
 * @date 2022/1/19 19:12
 */
public class Test {

	public static void main(String[] args) {
		System.getProperties().put("com.misc.ProxyGenerator.saveGeneratedFiles", "true");
		Calculator proxy = CalculatorProxy.getProxy(new MyCalculator());
		proxy.add(1,1);
		System.err.println(proxy.getClass());

	}
}
