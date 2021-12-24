package com.zr.mytag;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * @author zhourui
 * @date 2021/12/24 11:14
 */
public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {


	@Override
	protected Class<?> getBeanClass(Element element) {
		return User.class;
	}

	@Override
	protected void doParse(Element element, BeanDefinitionBuilder builder) {
		// 获取标签的属性值
		Long id = Long.getLong(element.getAttribute("id"));
		String username = element.getAttribute("username");
		String email = element.getAttribute("email");

		if(id != null) {
			builder.addPropertyValue("id", id);
		}
		if(StringUtils.hasText(username)) {
			builder.addPropertyValue("username", username);
		}
		if(StringUtils.hasText(email)) {
			builder.addPropertyValue("email", email);
		}
	}
}
