package com.pluralsight.abstra.factory;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(775);
		
		CreditCard card = abstractFactory.getCrediCart(CardType.PLATINUM);
		
		System.out.println(card.getClass());
		
		abstractFactory = CreditCardFactory.getCreditCardFactory(600);
		
		CreditCard card2 = abstractFactory.getCrediCart(CardType.GOLD);
		
		System.out.println(card2.getClass());
		
	}

}
