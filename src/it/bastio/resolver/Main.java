package it.bastio.resolver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import it.bastio.resolver.constants.DiceConstants;
import it.bastio.resolver.model.Dice;
import it.bastio.resolver.model.Game;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> d1X = new ArrayList<>();
		d1X.add(DiceConstants.GIALLO);
		d1X.add(DiceConstants.BLU);
		d1X.add(DiceConstants.BLU);
		d1X.add(DiceConstants.ROSSO);
		List<String> d1Y = new ArrayList<>();
		d1Y.add(DiceConstants.GIALLO);
		d1Y.add(DiceConstants.VERDE);
		d1Y.add(DiceConstants.BLU);
		d1Y.add(DiceConstants.VERDE);
		List<String> d1Z = new ArrayList<>();
		d1Z.add(DiceConstants.VERDE);
		d1Z.add(DiceConstants.BLU);
		d1Z.add(DiceConstants.VERDE);
		d1Z.add(DiceConstants.ROSSO);
		Dice d1 = new Dice(d1X, d1Y, d1Z);

		List<String> d2X = new ArrayList<>();
		d2X.add(DiceConstants.ROSSO);
		d2X.add(DiceConstants.GIALLO);
		d2X.add(DiceConstants.BLU);
		d2X.add(DiceConstants.GIALLO);
		List<String> d2Y = new ArrayList<>();
		d2Y.add(DiceConstants.ROSSO);
		d2Y.add(DiceConstants.GIALLO);
		d2Y.add(DiceConstants.BLU);
		d2Y.add(DiceConstants.VERDE);
		List<String> d2Z = new ArrayList<>();
		d2Z.add(DiceConstants.VERDE);
		d2Z.add(DiceConstants.GIALLO);
		d2Z.add(DiceConstants.GIALLO);
		d2Z.add(DiceConstants.GIALLO);
		Dice d2 = new Dice(d2X, d2Y, d2Z);

		List<String> d3X = new ArrayList<>();
		d3X.add(DiceConstants.BLU);
		d3X.add(DiceConstants.GIALLO);
		d3X.add(DiceConstants.ROSSO);
		d3X.add(DiceConstants.VERDE);
		List<String> d3Y = new ArrayList<>();
		d3Y.add(DiceConstants.BLU);
		d3Y.add(DiceConstants.ROSSO);
		d3Y.add(DiceConstants.ROSSO);
		d3Y.add(DiceConstants.VERDE);
		List<String> d3Z = new ArrayList<>();
		d3Z.add(DiceConstants.VERDE);
		d3Z.add(DiceConstants.GIALLO);
		d3Z.add(DiceConstants.ROSSO);
		d3Z.add(DiceConstants.VERDE);
		Dice d3 = new Dice(d3X, d3Y, d3Z);

		List<String> d4X = new ArrayList<>();
		d4X.add(DiceConstants.VERDE);
		d4X.add(DiceConstants.GIALLO);
		d4X.add(DiceConstants.ROSSO);
		d4X.add(DiceConstants.ROSSO);
		List<String> d4Y = new ArrayList<>();
		d4Y.add(DiceConstants.VERDE);
		d4Y.add(DiceConstants.GIALLO);
		d4Y.add(DiceConstants.ROSSO);
		d4Y.add(DiceConstants.BLU);
		List<String> d4Z = new ArrayList<>();
		d4Z.add(DiceConstants.BLU);
		d4Z.add(DiceConstants.GIALLO);
		d4Z.add(DiceConstants.GIALLO);
		d4Z.add(DiceConstants.ROSSO);
		Dice d4 = new Dice(d4X, d4Y, d4Z);

		Game game = new Game();
		System.out.println(game.play(d1, d2, d3, d4));

	}

}
