package com.monocept.model;

public class TicTacToe {
	public TicTacToe() {

	}

	public boolean validationCellPoint(int charBoard[][], int row, int col) {

		// checking CellPoint validation
		if (charBoard[row][col] == 0)
			return true;

		return false;

	}

	public boolean validationPlayer(int chartBoard[][], int player) {

		// Loop for Both vertical and horizontal checking
		for (int col = 0; col < 3; col++) {

			// vertical checking
			if (chartBoard[col][0] == player && chartBoard[col][1] == player && chartBoard[col][2] == player)
				return true;

			// horizontal checking
			if (chartBoard[0][col] == player && chartBoard[1][col] == player && chartBoard[2][col] == player)
				return true;
		}

		// left diagonal checking
		if (chartBoard[0][0] == player && chartBoard[1][1] == player && chartBoard[2][2] == player)
			return true;

		// right diagonal checking
		if (chartBoard[0][0] == player && chartBoard[1][1] == player && chartBoard[2][2] == player)
			return true;

		return false;
	}
}
