package com.abstractfactorydesign.factoryClass;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MenJeans")
public class MenJeans implements Cloth {

	@Override
	public String getCloth() {
		return "Men's Jeans";
	}

}
