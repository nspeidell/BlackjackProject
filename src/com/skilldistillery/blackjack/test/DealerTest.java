package com.skilldistillery.blackjack.test;

import java.util.Scanner;

import com.skilldistillery.blackjack.entities.Card;
import com.skilldistillery.blackjack.entities.Deck;
import com.skilldistillery.blackjack.entities.Rank;

public class DealerTest {

	public static void main(String[] args) {
		DealerTest dealer = new DealerTest();
		dealer.run();

	}
public void run() {
	Deck deck = new Deck();
	deck.shuffle();
	System.out.println("Current number of cards in the deck " + deck.checkSize());
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("How many cards");
	int numCardsIWant = scanner.nextInt();
	scanner.nextLine();
	int sumOfCards = 0;
	for (int cardNumDealt = 0; cardNumDealt < numCardsIWant; cardNumDealt++) {
		Card dealtCard = deck.dealCard();
		 sumOfCards = dealtCard.getRank().getValue();
		System.out.println("Your card is a: " + dealtCard + " sumOfCards: " + sumOfCards);
		System.out.println( deck.checkSize());
	}
}
}
