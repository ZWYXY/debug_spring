package com.zr.aop;

import com.zr.aop.use.Calculator;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spring中默认的对象都是单例的，spring会在一级缓存中持有该对象，方便下次直接获取，那么如果是prototype的话，会创建一个新对象
 * 如果想在单例模式的bean下引用一个原型模式的bean怎么办？
 * 需要引用lookup-method标签来解决此问题
 *
 * 通过拦截器的方式，每次需要的时候都去创建最新的原型对象，而不是缓存原型对象
 *
 * @author zhourui
 * @date 2021/12/23 14:51
 */
public class AopStart {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac
				= new ClassPathXmlApplicationContext("008Aop.xml");

		Calculator calculator = ac.getBean("calculator", Calculator.class);

		System.err.println(calculator.doAdd(1, 2));
		System.err.println("--------------------------");
		System.err.println(calculator.doDivide(1, 0));
	}

}
