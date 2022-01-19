package com.zr.proxy.cglib;

import com.zr.proxy.jdk.Calculator;

/**
 * @author zhourui
 * @date 2022/1/19 19:06
 */
public class MyCalculator {

	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public int mul(int a, int b) {
		return a * b;

	}

	public int div(int a, int b) {
		return a / b;
	}
}
