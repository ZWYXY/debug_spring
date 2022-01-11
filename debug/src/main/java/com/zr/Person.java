package com.zr;

import org.springframework.stereotype.Component;

/**
 * @author zhourui
 * @date 2021/12/23 14:57
 */
@Component
public class Person {

	private Long id = 1231L;
	private String name = "paopao1";

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

	@Override
	public String toString() {
		return "Person{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
