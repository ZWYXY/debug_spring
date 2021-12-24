package com.zr.custompropertyeditor;

import java.beans.PropertyEditorSupport;

/**
 * @author zhourui
 * @date 2021/12/24 17:07
 */
public class AddressPropertyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] s = text.split("_");
		Address address = new Address();
		address.setProvince(s[0]);
		address.setCity(s[1]);
		address.setTown(s[2]);
		this.setValue(address);
	}
}
