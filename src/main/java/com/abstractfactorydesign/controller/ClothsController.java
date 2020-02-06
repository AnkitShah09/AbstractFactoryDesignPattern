package com.abstractfactorydesign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abstractfactorydesign.abstractFactoryProvider.ClothsAbstractFactoryProvider;
import com.abstractfactorydesign.factoryProvider.AbstractFactory;

@RestController
@RequestMapping("/cloths")
public class ClothsController {

	@Autowired
	ClothsAbstractFactoryProvider clothsFactory;

	@GetMapping("/getMensCloths/{typeOfCloth}")
	public String getMensCloths(@PathVariable("typeOfCloth") String typeOfCloth) {
		AbstractFactory mensClothsFactory = clothsFactory.getFactory("MenClothFactory");
		return mensClothsFactory.getWear(typeOfCloth);
	}

	@GetMapping("/getWomensCloths/{typeOfCloth}")
	public String getWomensCloths(@PathVariable("typeOfCloth") String typeOfCloth) {
		AbstractFactory womensClothsFactory = clothsFactory.getFactory("WomenClothFactory");
		return womensClothsFactory.getWear(typeOfCloth);
	}
}
