package com.abstractfactorydesign.factoryClass;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("WomenJeans")
public class WomenJeans implements Cloth {

	@Override
	public String getCloth() {
		return "Women Jeans";
	}
}
