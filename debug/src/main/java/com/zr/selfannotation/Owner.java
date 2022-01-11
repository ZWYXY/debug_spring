package com.zr.selfannotation;

import org.springframework.stereotype.Component;

/**
 * @author zhourui
 * @date 2022/1/11 14:11
 */

@Component
public class Owner {

	public void show() {
		System.err.println("Owner");
	}

}
