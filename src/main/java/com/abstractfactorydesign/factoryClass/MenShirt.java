package com.abstractfactorydesign.factoryClass;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MenShirt")
public class MenShirt implements Cloth {

	@Override
	public String getCloth() {
		return "Men Shirt";
	}

}
