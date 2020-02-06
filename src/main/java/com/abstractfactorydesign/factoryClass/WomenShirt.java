package com.abstractfactorydesign.factoryClass;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("WomenShirt")
public class WomenShirt implements Cloth {

	@Override
	public String getCloth() {
		return "Women Shirt";
	}

}
