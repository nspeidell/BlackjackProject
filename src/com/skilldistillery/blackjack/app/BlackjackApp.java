package com.skilldistillery.blackjack.app;

import com.skilldistillery.blackjack.entities.Dealer;
import com.skilldistillery.blackjack.entities.Player;

public class BlackjackApp {
	Dealer highRoller = new Dealer();
	Player playerOne = new Player();
	int hitOrNot = 0;

	public static void main(String[] args) {
		BlackjackApp bja = new BlackjackApp();
		bja.launch();

	}

	public void launch() {
		highRoller.startGame();
		boolean hasBlackjack = highRoller.checkForBlackjack();
		if (hasBlackjack == false) {
			gameLogic();

		} else {
		}
		highRoller.clearAll();
		int play = playerOne.playAgainDecision();
		if (play == 1) {
			if (highRoller.clearAll() > 12) {
				launch();
			} else {
				System.out.println("You're out of cards, thanks for playing");
			}
		} else {
			System.out.println("You decided to Quit, Game Over");
		}
	}

	public void gameLogic() {

		do {

			hitOrNot = playerOne.playerDecision();
			if (hitOrNot == 1) {
				highRoller.dealOnePlayerCard();
				highRoller.showPlayerHand();
				boolean playerBust = highRoller.checkForPlayerBust();
				if (playerBust == true) {
					hitOrNot = 2;
					break;
				}
			} else if (hitOrNot == 2) {
				highRoller.dealerPlay();
				break;

			}
		} while (hitOrNot != 2);

		highRoller.winner();
		highRoller.showFinalHands();
	}
}
