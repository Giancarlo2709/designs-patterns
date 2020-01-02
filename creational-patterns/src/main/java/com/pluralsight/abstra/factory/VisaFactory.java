package com.pluralsight.abstra.factory;

public class VisaFactory extends CreditCardFactory {

	@Override
	public CreditCard getCrediCart(CardType cardType) {
		switch(cardType) {
			case GOLD:
				return new VisaGoldCreditCard();
			case PLATINUM: 
				return new VisaBlackCreditCard();
		}
		return null;
	}

	@Override
	public Validator getValidator(CardType cardType) {
		return new VisaValidator();
	}

}
