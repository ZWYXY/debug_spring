package com.zr;

import com.zr.annotation.DogeDoge;
import com.zr.mytag.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhourui
 * @date 2021/12/23 14:51
 */
public class _003ForDebugAutowired {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext classPathXmlApplicationContext =
			new ClassPathXmlApplicationContext("003ApplicationContextForAutowired.xml");

		DogeDoge dogeDoge = (DogeDoge) classPathXmlApplicationContext.getBean("dogeDoge");

		System.err.println(dogeDoge.getOwner().getName());
	}

}
