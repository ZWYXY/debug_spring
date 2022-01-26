package com.zr.tx.xml.service;

import com.zr.tx.xml.dao.BookDao;

/**
 * @author zhourui
 * @date 2022/1/24 11:15
 */
public class BookService {
	private BookDao bookDao;

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	public void checkOut(String username, int bookId) {
		bookDao.updateStock(bookId);
		bookDao.getPrice(bookId);
		bookDao.updateBalance(username, 123);
	}
}
