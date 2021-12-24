package com.zr;

import com.zr.mytag.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhourui
 * @date 2021/12/23 14:51
 */
public class Demo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext
				= new ClassPathXmlApplicationContext("ApplicationContext.xml");
		User user = (User) classPathXmlApplicationContext.getBean("firstMyTag");
		System.err.println(user.getUsername());
	}

}
