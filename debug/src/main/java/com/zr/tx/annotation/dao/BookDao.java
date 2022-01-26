package com.zr.tx.annotation.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zhourui
 * @date 2022/1/24 11:16
 */
public class BookDao {

	private JdbcTemplate jdbcTemplate;
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Transactional
	public void updateStock(int id) {
		jdbcTemplate.update("update book set stock = stock-1 where id = ?", id);
	}

	@Transactional
	public int getPrice(int id) {
		Integer price = jdbcTemplate.queryForObject("select price from book where id = ?", Integer.class, id);
		return price;
	}

	@Transactional
	public void updateBalance(String username, int price) {
		jdbcTemplate.update("update user set balance = balance - ? where name = ?", price, username);
	}
}
