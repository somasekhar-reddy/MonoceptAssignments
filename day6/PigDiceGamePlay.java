package com.monocept.pigdicegame;

import java.util.Random;
import java.util.Scanner;

import com.monocept.model.PigDiceGame;

public class PigDiceGamePlay {

	public static Scanner scan = new Scanner(System.in);

	public static PigDiceGame obj = new PigDiceGame();

	public static int score = 0;

	public static boolean check;

	public int GameRunningPlayer(int turns, int totalScore) {
		int score = totalScore, max = 6, min = 1, randNo;
		char decision;
		check = false;
		Random rand = new Random();
		System.out.println("\nTURN " + turns + " :");

		System.out.println("Welcome to the game of Pig!");

		do {
			System.out.print("\nEnter \'r\' to roll again, \'h\' to hold :");
			decision = scan.nextLine().charAt(0);
			if (decision == 'r') {
				randNo = rand.nextInt(max - min) + min;
				System.out.println("You rolled : " + randNo);
				if (randNo == 1) {
					score = 0;
					check = true;
					System.out.println("Turn over. No Score.");
					break;
				}
				score += randNo;

				if (obj.validationSuccess(score)) {
					System.out.println("Your turn score is " + score + " and your total score is " + score);
					System.out.println("You Win! You finished in " + turns + " turns!");
					return score;
				}
				System.out.println("Your turn score is " + score + " and your total score is " + totalScore);
				System.out.println("If you hold, you will have " + score + " points");
			} else {
				System.out.println("Your turn score is " + score + " and your total score is " + score);
			}

		} while (decision != 'h');

		return score;
	}

	public static void main(String[] args) {
		int totalScore, decision, turns;
		PigDiceGamePlay runningGame = new PigDiceGamePlay();
		System.out.println("----------------------WELCOME-----------------------");
		System.out.println("GAME NAME : PIG DICE GAME");
		System.out.println(" Let's Play PIG!");
		System.out.println("* See how many turns it takes you to get to 20.");
		System.out.println("* Turn ends when you hold or roll a 1.");
		System.out.println("* If you roll a 1, you lose all points for the turn.");
		System.out.println("* If you hold, you save all points for the turn.");

		System.out.print("Would you like to play Game [1] for Play [0] for Exit: ");
		decision = scan.nextInt();
		scan.nextLine();

		while (decision == 1) {
			totalScore = 0;
			turns = 1;

			do {
				totalScore = runningGame.GameRunningPlayer(turns, totalScore);
				turns++;
				if (check == true)
					totalScore = 0;
			} while (totalScore < 20);

			System.out.print("\nWould you like to play Game [1] for Play [0] for Exit: ");
			decision = scan.nextInt();
			scan.nextLine();
		}
		System.out.println("You are Exit, come and play again.");
	}

}
