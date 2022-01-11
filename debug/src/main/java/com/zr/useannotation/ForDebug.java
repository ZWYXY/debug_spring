package com.zr.useannotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试PostConstruct 和 PreDestroy
 *
 * @author zhourui
 * @date 2021/12/23 14:51
 */
public class ForDebug {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac
				= new ClassPathXmlApplicationContext("006AnnotationPostConstructEtc.xml");
		ac.getBean("human", Human.class);
		ac.close();
	}

}
