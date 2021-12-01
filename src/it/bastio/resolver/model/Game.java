package it.bastio.resolver.model;

public class Game {

	public String play(Dice d1, Dice d2, Dice d3, Dice d4) {
		String solution = "";
		boolean isCorrect = false;
		isCorrect = _checkSolution(d1, d2, d3, d4);

		return solution;
	}

	private boolean _checkSolution(Dice d1, Dice d2, Dice d3, Dice d4) {
		boolean isCorrect = false;

		//TODO CHECK POSITION

		return isCorrect;
	}
}
