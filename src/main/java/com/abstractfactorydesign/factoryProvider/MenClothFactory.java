package com.abstractfactorydesign.factoryProvider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.abstractfactorydesign.factoryClass.Cloth;

@Component
@Qualifier("MenClothFactory")
public class MenClothFactory implements AbstractFactory {

	@Autowired
	@Qualifier("MenShirt")
	Cloth menShirt;

	@Autowired
	@Qualifier("MenJeans")
	Cloth menJeans;

	@Override
	public String getWear(String typeOfCloth) {
		if (typeOfCloth.equalsIgnoreCase("MenShirt"))
			return menShirt.getCloth();
		else if (typeOfCloth.equalsIgnoreCase("MenJeans"))
			return menJeans.getCloth();
		return null;
	}

}