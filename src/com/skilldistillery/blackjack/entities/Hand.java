package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
	
	protected List<Card> hand;

	public Hand() {
		hand = new ArrayList<>();

	}

	public void add(Card dealtCard) {
		hand.add(dealtCard);
	}

	public String toString() {
		return " showing, with cards =  " + hand + "";
	}

	public abstract int getHandValue();


	public void clear() {
		hand.removeAll(hand);
	}
	}

