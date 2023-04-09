package com.skilldistillery.blackjack.entities;

public class Dealer extends Player {
	private Deck deck = new Deck();
	private BlackJackHand dealerHand = new BlackJackHand();

	public void startGame() {
		shuffle();
		dealCards();
		showPlayerHand();

	}

//public void 
	public boolean checkForBlackjack() {
		if (dealerHand.isBlackjack()) {
			System.out.println("Dealer has Blackjack you lose");
			System.out.println("Dealer had: " + dealerHand.getHandValue() + " " + dealerHand);
			return true;
		}
		if (playerHand.isBlackjack()) {
			System.out.println("BLACKJACK!!! You win");
			return true;
		} else {
		}
		return false;
	}

	public void checkForDealerBust() {
		if (dealerHand.isBust()) {
		}

		else {
		}
	}

	public boolean checkForPlayerBust() {
		if (playerHand.isBust()) {
			return true;
		} else {
		}
		return false;
	}

	public void showFinalHands() {
		System.out.println("Player had: " + playerHand.getHandValue() + " " + playerHand);
		System.out.println("Dealer had: " + dealerHand.getHandValue() + " " + dealerHand);

	}

	public void showPlayerHand() {
		System.out.println("Player has: " + playerHand.getHandValue() + " " + playerHand);

	}

	public void shuffle() {
		System.out.println("Let's play Blackjack");
		System.out.println("      GoodLuck      ");
		System.out.println("--------------------");
		System.out.println();

		deck.shuffle();
	}

	public void dealerPlay() {
		System.out.println("Dealer cards are: " + " " + dealerHand.getHandValue() + dealerHand);
		do {
			int sumOfHand = dealerHand.getHandValue();
			if (sumOfHand < 18) {
				dealOneDealerCard();
				System.out.println("Dealer has " + " " + dealerHand.getHandValue() + dealerHand);
				checkForDealerBust();
			} else {
			}
		} while (dealerHand.getHandValue() < 18);
	}

	public void dealCards() {
		Card dealtCard = deck.dealCard();
		playerHand.add(dealtCard);
		System.out.println("Player card: " + dealtCard);

		dealtCard = deck.dealCard();
		dealerHand.add(dealtCard);
		System.out.println("Dealer: First card down");

		dealtCard = deck.dealCard();
		playerHand.add(dealtCard);
		System.out.println("Player card: " + dealtCard);

		dealtCard = deck.dealCard();
		dealerHand.add(dealtCard);
		System.out.println("Dealer showing: " + dealtCard);
	}

	public void dealOneDealerCard() {
		Card dealtCard = deck.dealCard();
		dealerHand.add(dealtCard);
		System.out.println("Dealer next card: " + dealtCard);

	}

	public void dealOnePlayerCard() {

		Card dealtCard = deck.dealCard();
		playerHand.add(dealtCard);
		System.out.println("Player next card: " + dealtCard);

	}

	public void winner() {
		if (playerHand.getHandValue() < 22) {
			if (dealerHand.getHandValue() < 22) {
				if (playerHand.getHandValue() == dealerHand.getHandValue()) {
					System.out.println();
					System.out.println("Game is a push");
					System.out.println();
				} else if (playerHand.getHandValue() > dealerHand.getHandValue()) {
					System.out.println();
					System.out.println("You Won");
					System.out.println();
				} else if (playerHand.getHandValue() < dealerHand.getHandValue()) {
					System.out.println();
					System.out.println("You Lost");
					System.out.println();
				}
			} else {
				System.out.println();
				System.out.println("Dealer busted player wins");
				System.out.println();
			}
		} else {
			System.out.println();
			System.out.println("Player busted and lost");
			System.out.println();
		}
	}

	public int clearAll() {
		dealerHand.clear();
		playerHand.clear();
		int deckSize = deck.checkSize();
		return deckSize;
	}
}
