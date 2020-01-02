package com.pluralsight.abstra.factory;

public class AmexFactory extends CreditCardFactory {

	@Override
	public CreditCard getCrediCart(CardType cardType) {
		switch(cardType) {
			case GOLD: 
				return new AmexGoldCreditCard();
				
			case PLATINUM:
				return new AmexPlatinumCreditCard();
			
			default:
				break;
		}
		return null;
	}

	@Override
	public Validator getValidator(CardType cardType) {
		switch(cardType) {
			case GOLD:
				return new AmexGoldValidator();
				
			case PLATINUM:
				return new AmexPlatinumValidator();
		}
		return null;
	}

}
