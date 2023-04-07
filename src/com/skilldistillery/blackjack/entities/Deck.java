package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	// has a list of cards
	private List<Card> cardDeck = new ArrayList<>();

	// each deck has 52 cards
	public Deck() {
		Rank[] ranks = Rank.values();
		Suit[] suits = Suit.values();

		for (Suit suit : suits) {
			for (Rank rank : ranks) {
				Card card = new Card(suit, rank);
				cardDeck.add(card);
			}
		}
	}

	public List<Card> getDeck() {
		return cardDeck;

	}

	public void shuffle() {
		Collections.shuffle(cardDeck);
		;
	}

	public Card dealCard() {
		Card dealtCard = cardDeck.remove(0);
		return dealtCard;
	}

	public int checkSize() {
		return cardDeck.size();
	}
}
