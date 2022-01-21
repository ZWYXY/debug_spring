package com.zr.aop.annotation.service;

import org.springframework.stereotype.Service;

/**
 *
 * @author zhourui
 * @date 2022/1/18 9:36
 */
@Service
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
