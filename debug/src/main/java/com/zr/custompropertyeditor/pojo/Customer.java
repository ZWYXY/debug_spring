package com.zr.custompropertyeditor.pojo;

/**
 * @author zhourui
 * @date 2021/12/24 17:19
 */
public class Customer {

	private String name ;

	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer{" +
				"name='" + name + '\'' +
				", address=" + address +
				'}';
	}
}
