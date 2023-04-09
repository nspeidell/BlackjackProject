package com.skilldistillery.blackjack.entities;

import java.util.Scanner;

public class Player {
	protected BlackJackHand playerHand = new BlackJackHand();
	
	
	public int playerDecision() {
	Scanner kb = new Scanner(System.in);
	System.out.println();
	System.out.println("To Hit Press: 1, or to Stay Press: 2?");
	System.out.println();
	int hitOrStayInput = kb.nextInt();
	return hitOrStayInput;
	}
	public int playAgainDecision() {
		Scanner kb = new Scanner(System.in);	
		System.out.println();
		System.out.println("To play again press 1 to quit press 2");
		System.out.println();
		int play = kb.nextInt();
		return play;
	}	
}
