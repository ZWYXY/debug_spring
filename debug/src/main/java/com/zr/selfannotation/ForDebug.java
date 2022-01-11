package com.zr.selfannotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试 仿写的Spring @Autowired
 *
 * @author zhourui
 * @date 2021/12/23 14:51
 */
public class ForDebug {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac
				= new ClassPathXmlApplicationContext("007MyAutowiredAnnotation.xml");
		PetDog petDog = ac.getBean("petDog", PetDog.class);
		petDog.show();
	}

}
