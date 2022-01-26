package com.zr.tx.annotation.service;

import com.zr.tx.annotation.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zhourui
 * @date 2022/1/24 11:15
 */
public class BookService {

	private BookDao bookDao;
	@Autowired
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	@Transactional
	public void checkOut(String username, int bookId) {
		bookDao.updateStock(bookId);
		bookDao.getPrice(bookId);
		bookDao.updateBalance(username, 123);
	}
}
