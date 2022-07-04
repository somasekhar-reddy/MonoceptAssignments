package com.monocept.model;

public class PigDiceGame {
	public PigDiceGame() {
	}

	public boolean validationSuccess(int totalScore) {
		if (totalScore >= 20)
			return true;
		return false;
	}
}
