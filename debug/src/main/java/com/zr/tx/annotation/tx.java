package com.zr.tx.annotation;

import com.zr.tx.annotation.config.TransactionConfig;
import com.zr.tx.annotation.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhourui
 * @date 2021/12/23 14:51
 */
public class tx {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(TransactionConfig.class); // 如果想让spring自动去扫描，需要依赖于这个类Config urationClassPostProcessor
		context.refresh();

		BookService bean = context.getBean(BookService.class);
		bean.checkOut("xx", 1);
	}

}
