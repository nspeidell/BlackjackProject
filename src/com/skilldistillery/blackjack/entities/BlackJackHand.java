package com.skilldistillery.blackjack.entities;

public class BlackJackHand extends Hand {

	public boolean isBlackjack() {
		if (getHandValue() == 21) {
			System.out.println("BLACKJACK");
			return true;
		} else {
			return false;
		}
	}

	public boolean isBust() {
		if (getHandValue() > 21) {
			System.out.println("Bust");
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int getHandValue() {
		int sumOfCards = 0;
		for (Card card : hand) {
			sumOfCards += card.getRank().getValue();
		}
		return sumOfCards;
	}
public void maskedCard() {
System.out.println();
}

}


