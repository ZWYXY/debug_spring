package com.zr.tx.xml.po;

import lombok.Data;

/**
 * @author zhourui
 * @date 2022/1/24 14:55
 */
public class Book {

	private Integer id;

	private String bookName;

	private Integer price;

	private Integer stock;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}
}
