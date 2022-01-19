package com.zr.proxy.jdk;

/**
 * @author zhourui
 * @date 2022/1/19 19:06
 */
public class MyCalculator implements Calculator{

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int sub(int a, int b) {
		return a - b;
	}

	@Override
	public int mul(int a, int b) {
		return a * b;

	}

	@Override
	public int div(int a, int b) {
		return a / b;
	}
}
