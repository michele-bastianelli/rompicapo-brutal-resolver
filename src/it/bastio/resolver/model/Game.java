package it.bastio.resolver.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import it.bastio.resolver.constants.DiceConstants;

public class Game {

	public String play(Dice d1, Dice d2, Dice d3, Dice d4) {
		String solution = "";
		int move = 0;
		boolean isCorrect = false;

		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				for (int j2 = 0; j2 < 15; j2++) {
					do {
						isCorrect = _checkSolution(d1, d2, d3, d4);
						if(isCorrect) {
							solution = _printSolution(d1, d2, d3, d4, move);
							break;
						}
						d4.nextState();
						System.out.println("Mossa n°: " + move);
						move++;
					} while (d4.getOrientation().equalsIgnoreCase(
							DiceConstants.X) && d4.getRotation() == 0);
					d3.nextState();
				}
				d2.nextState();
			}
			d1.nextState();
		}
		return solution;
	}

	//TODO CHECK POSITION
	public boolean _checkSolution(Dice d1, Dice d2, Dice d3, Dice d4) {
		boolean isUnique = true;

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

			isUnique = (set.size() == DiceConstants.ROTATION_NUMBER) 
				&& isUnique;
		}

		return isUnique;
	}

	private String _printSolution(Dice d1, Dice d2, Dice d3, Dice d4, int move) {
		String divisore = "\n--------------------------\n";
		String solution = "mosse=" + String.valueOf(move) + "\n" 
			+ d1.toString() + divisore + d2.toString() + divisore 
			+ d3.toString() + divisore + d4.toString();
		return solution;
	}
}
