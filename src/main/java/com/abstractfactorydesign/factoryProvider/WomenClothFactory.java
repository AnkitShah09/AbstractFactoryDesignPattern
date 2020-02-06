package com.abstractfactorydesign.factoryProvider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.abstractfactorydesign.factoryClass.Cloth;

@Component
@Qualifier("WomenClothFactory")
public class WomenClothFactory implements AbstractFactory {

	@Autowired
	@Qualifier("WomenShirt")
	Cloth womenShirt;

	@Autowired
	@Qualifier("WomenJeans")
	Cloth womenJeans;

	@Override
	public String getWear(String typeOfCloth) {
		if (typeOfCloth.equalsIgnoreCase("WomenShirt"))
			return womenShirt.getCloth();
		else if (typeOfCloth.equalsIgnoreCase("WomenJeans"))
			return womenJeans.getCloth();
		return null;
	}

}
