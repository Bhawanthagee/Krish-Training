package com.company;

public class Main {

    public static void main(String[] args) {
	    KottuFactory kottuFactory = new KottuFactory();

	    Kottu kottuCategoryOne = kottuFactory.getKottu("egg kottu");
	    kottuCategoryOne.addonsToKottu();

	    Kottu kottuCategoryTwo = kottuFactory.getKottu("chicken kottu");
	    kottuCategoryTwo.addonsToKottu();
    }
}
