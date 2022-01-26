package com.zr.tx.xml.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Map;

/**
 * @author zhourui
 * @date 2022/1/24 11:16
 */
public class BookDao {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void updateStock(int id) {
		jdbcTemplate.update("update book set stock = stock-1 where id = ?", id);
	}

	public int getPrice(int id) {
		Map<String, Object> map = jdbcTemplate.queryForMap("select * from book where id = ?", id);
		return (int) map.get("price");
	}

	public void updateBalance(String username, int price) {
		jdbcTemplate.update("update user set balance = balance - ? where name = ?", price, username);
	}
}
