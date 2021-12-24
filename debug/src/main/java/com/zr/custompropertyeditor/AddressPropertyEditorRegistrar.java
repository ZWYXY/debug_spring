package com.zr.custompropertyeditor;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

/**
 * @author zhourui
 * @date 2021/12/24 17:11
 */
public class AddressPropertyEditorRegistrar implements PropertyEditorRegistrar {

	@Override
	public void registerCustomEditors(PropertyEditorRegistry registry) {
		registry.registerCustomEditor(Address.class, new AddressPropertyEditor());
	}

}
