package com.zr.aop.use;

import org.springframework.stereotype.Component;

/**
 *
 * @author zhourui
 * @date 2022/1/18 9:36
 */
//@Component
public class Calculator {

	public int doAdd(int a, int b) {
		System.err.println("doAdd....");
		return a + b;
	}

	public int doDivide(int a, int b) {
		System.err.println("doAdd....");
		return a/b;
	}
}
