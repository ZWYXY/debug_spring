package com.zr.mytag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author zhourui
 * @date 2021/12/24 11:10
 */
public class UserNameSpaceHandler extends NamespaceHandlerSupport {


	@Override
	public void init() {
		registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
	}
}
