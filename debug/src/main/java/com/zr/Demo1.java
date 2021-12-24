package com.zr;

import com.zr.custompropertyeditor.Customer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhourui
 * @date 2021/12/23 14:51
 */
public class Demo1 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext
				= new ClassPathXmlApplicationContext("ApplicationContext1.xml");
		Customer bean = classPathXmlApplicationContext.getBean(Customer.class);
		System.err.println(bean);
	}

}
