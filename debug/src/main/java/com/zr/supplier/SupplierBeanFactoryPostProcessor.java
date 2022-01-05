package com.zr.supplier;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

import java.util.function.Supplier;

/**
 * @author zhourui
 * @date 2022/1/5 10:55
 */
public class SupplierBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

 	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		BeanDefinition user = beanFactory.getBeanDefinition("user");
		GenericBeanDefinition beanDefinition = (GenericBeanDefinition) user;
		beanDefinition.setInstanceSupplier(CreateSupplier::createUser);
		beanDefinition.setBeanClass(User.class);
	}
}
