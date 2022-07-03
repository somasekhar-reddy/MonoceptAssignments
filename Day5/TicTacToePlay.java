package com.monocept.tictoctoeplay;

import java.util.Scanner;

import com.monocept.model.TicTacToe;

public class TicTacToePlay {
	public TicTacToe obj = new TicTacToe();
	public static Scanner scan = new Scanner(System.in);

	public boolean GameRunningPlayer(int chartBoard[][], int playerNo, char playerName) {

		boolean flag;
		int row, col;

		do {
			System.out.print("\'" + playerName + "\', enter your move (row[1-3] column[1-3]) :");
			row = scan.nextShort();
			col = scan.nextShort();
			flag = obj.validationCellPoint(chartBoard, row, col);
			if (flag) {
				chartBoard[row][col] = playerNo;
				if (obj.validationPlayer(chartBoard, playerNo)) {
					System.out.println(" Player \'" + playerName + "\' won the match ");
					return true;
				}
			} else {

				System.out.println(" This move at (" + row + "," + col + ") is not valid. Try again...");
			}

		} while (flag == false);

		return false;
	}

	public static void main(String[] args) {

		TicTacToePlay obj = new TicTacToePlay();
		int decision, chartBoard[][];

		System.out.println("-----------------WELCOME----------------------");
		System.out.println("GAME NAME : TIC - TAC - TOE");
		System.out.println("Game Rules: ");

		System.out.println(
				"1. the first player plays with \"X\". So you can decide who wants to go \"X\" and who wants go with \"O\".");
		System.out.println("2. Only one player can play at a time.");
		System.out.println("3. If any of the players have filled"
				+ " a square then the other player and the same player cannot override that square.");
		System.out.println("4. There are only two conditions that may be match will be draw or may be win.");
		System.out.println("5. The player that succeeds in placing three respective mark (X or O)"
				+ " in a horizontal, vertical or diagonal row wins the game.");

		System.out.print("Would you like to play the Game [1] for play [0] for exit:");
		decision = scan.nextShort();

		if (decision == 1) {

			int TotalCellsLeft;
			boolean flag;

			while (decision == 1) {

				TotalCellsLeft = 9;
				chartBoard = new int[3][3];

				while (TotalCellsLeft > 0) {

					flag = obj.GameRunningPlayer(chartBoard, 1, 'X');
					TotalCellsLeft--;
					if (flag) {
						TotalCellsLeft = -1;
					}

					if (TotalCellsLeft > 0) {
						flag = obj.GameRunningPlayer(chartBoard, 2, 'O');
						TotalCellsLeft--;
					}
					if (flag) {
						TotalCellsLeft = -1;
					}
				}

				if (TotalCellsLeft == 0)
					System.out.println("NO one own the match,Its a DRAW.");

				System.out.print("Would you like to play the Game [1] for play [0] for exit:");
				decision = scan.nextShort();
			}
		}

		System.out.println("You are Exit.Thank you come and play again.");

	}
}
