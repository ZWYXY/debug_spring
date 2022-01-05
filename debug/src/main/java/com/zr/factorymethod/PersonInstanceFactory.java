package com.zr.factorymethod;

/**
 * @author zhourui
 * @date 2022/1/5 14:26
 */
public class PersonInstanceFactory {

	public Person getPerson(String name) {
		Person person = new Person();
		person.setId(1);
		person.setName(name);
		return person;
	}

}
