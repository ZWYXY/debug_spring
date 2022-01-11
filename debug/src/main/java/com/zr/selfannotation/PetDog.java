package com.zr.selfannotation;

import com.zr.Person;
import org.springframework.stereotype.Component;

/**
 * @author zhourui
 * @date 2022/1/11 13:35
 */

@Component
public class PetDog {

	@MyAutowired
	private Owner owner;

	public void show() {
		owner.show();
	}
}
