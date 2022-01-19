package com.zr.proxy.cglib;

import com.zr.proxy.jdk.Calculator;
import com.zr.proxy.jdk.CalculatorProxy;
import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.cglib.proxy.Enhancer;

/**
 * @author zhourui
 * @date 2022/1/19 19:12
 */
public class Test {

	public static void main(String[] args) {
		// 动态代理创建的class文件存储到本地
		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "d:\\");

		// 通过cglib动态代理获取代理对象的过程，创建调用的对象
		// 在后续创建过程中EnhanceKey的对象，所以在进行enhancer对象创建的时候，需要把EnhancerKey（newInstance）对象就准备好，恰好这个对象也需要动态代理生成
		Enhancer enhancer = new Enhancer();

		// 设置Enhancer父类
		enhancer.setSuperclass(MyCalculator.class);

		// 设置enhancer回调对象
		enhancer.setCallback(new MyCglib());

		// 创建代理对象
		MyCalculator myCalculator = (MyCalculator) enhancer.create();
		// 通过代理对象调用目标方法
		myCalculator.add(1,1);
		System.err.println(myCalculator.getClass());


	}
}
