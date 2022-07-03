package com.monocept.model;

public class TicTacToe {

	public TicTacToe() {

	}

	public boolean validationCellPoint(int charBoard[][], int row, int col) {

		// checking CellPoint validation
		if (row >= 1 && row <= 3 && col <= 3 && col >= 1)
			if (charBoard[row - 1][col - 1] == 0)
				return true;

		return false;

	}

	public boolean validationPlayer(int chartBoard[][], int playerNo) {

		// Loop for Both vertical and horizontal checking
		for (int col = 0; col < 3; col++) {

			// vertical checking
			if (chartBoard[col][0] == playerNo && chartBoard[col][1] == playerNo && chartBoard[col][2] == playerNo)
				return true;

			// horizontal checking
			if (chartBoard[0][col] == playerNo && chartBoard[1][col] == playerNo && chartBoard[2][col] == playerNo)
				return true;
		}

		// left diagonal checking
		if (chartBoard[0][0] == playerNo && chartBoard[1][1] == playerNo && chartBoard[2][2] == playerNo)
			return true;

		// right diagonal checking
		if (chartBoard[0][0] == playerNo && chartBoard[1][1] == playerNo && chartBoard[2][2] == playerNo)
			return true;

		return false;
	}
}
