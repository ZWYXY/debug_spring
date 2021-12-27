package com.zr.annotation;

import com.zr.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author zhourui
 * @date 2021/12/27 9:02
 */
@Component
public class DogeDoge {

	@Autowired
	private Person owner;

	@Autowired
	private CatCat catCat;

	public CatCat getCatCat() {
		return catCat;
	}

	public void setCatCat(CatCat catCat) {
		this.catCat = catCat;
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}
}
