package com.zr.annotation;

import org.springframework.stereotype.Component;

/**
 * @author zhourui
 * @date 2021/12/27 9:49
 */
@Component
public class CatCat {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
