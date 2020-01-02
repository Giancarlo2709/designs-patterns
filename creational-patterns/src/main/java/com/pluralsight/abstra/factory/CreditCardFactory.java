package com.pluralsight.abstra.factory;

public abstract class CreditCardFactory {
	
	public static CreditCardFactory getCreditCardFactory(int creditScore) {
		if(creditScore > 650) {
			return new AmexFactory();
		}
		else {
			return new VisaFactory(); 
		}
	}
	
	public abstract CreditCard getCrediCart(CardType cardType);
	
	public abstract Validator getValidator(CardType cardType);

}
