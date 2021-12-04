package it.bastio.resolver.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Game {

	public String play(Dice d1, Dice d2, Dice d3, Dice d4) {
		String solution = "";
		boolean isCorrect = false;
		isCorrect = _checkSolution(d1, d2, d3, d4);

		return solution;
	}

	//TODO CHECK POSITION
	private boolean _checkSolution(Dice d1, Dice d2, Dice d3, Dice d4) {
		boolean hasDuplicate = false;

		List<String> d1Colors = d1.getCurrentAxis();
		List<String> d2Colors = d2.getCurrentAxis();
		List<String> d3Colors = d3.getCurrentAxis();
		List<String> d4Colors = d4.getCurrentAxis();

		for (int i = 0; i < d1Colors.size(); i++) {
			String d1Color = d1Colors.get(i);
			String d2Color = d2Colors.get(i);
			String d3Color = d3Colors.get(i);
			String d4Color = d4Colors.get(i);

			List<String> iPositions = new ArrayList<>();
			iPositions.add(d1Color);
			iPositions.add(d2Color);
			iPositions.add(d3Color);
			iPositions.add(d4Color);

			Set<String> set = new HashSet<String>(iPositions);

			hasDuplicate = iPositions.size() != set.size();
		}

		return !hasDuplicate;
	}
}
