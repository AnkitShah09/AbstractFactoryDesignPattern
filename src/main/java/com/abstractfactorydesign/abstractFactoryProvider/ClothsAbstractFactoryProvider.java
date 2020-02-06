package com.abstractfactorydesign.abstractFactoryProvider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.abstractfactorydesign.factoryProvider.AbstractFactory;
import com.abstractfactorydesign.factoryProvider.WomenClothFactory;

@Component
public class ClothsAbstractFactoryProvider {

	@Autowired
	@Qualifier("MenClothFactory")
	AbstractFactory menClothFactory;

	@Autowired
	@Qualifier("WomenClothFactory")
	WomenClothFactory womenClothFactory;

	public AbstractFactory getFactory(String typeOfFactory) {
		if (typeOfFactory.equalsIgnoreCase("MenClothFactory"))
			return menClothFactory;
		else if (typeOfFactory.equalsIgnoreCase("WomenClothFactory"))
			return womenClothFactory;
		return null;
	}
}
