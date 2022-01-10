package com.zr;

import org.springframework.stereotype.Component;

/**
 * @author zhourui
 * @date 2021/12/23 14:57
 */
@Component
public class Person {

	private Long id;
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
