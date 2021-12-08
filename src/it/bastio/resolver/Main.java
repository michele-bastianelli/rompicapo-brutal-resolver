package it.bastio.resolver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import it.bastio.resolver.model.Dice;
import it.bastio.resolver.model.Game;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> d1X = new ArrayList<>();
		d1X.add("1");
		d1X.add("2");
		d1X.add("3");
		d1X.add("4");
		List<String> d1Y = new ArrayList<>();
		d1Y.add("1");
		d1Y.add("2");
		d1Y.add("3");
		d1Y.add("4");
		List<String> d1Z = new ArrayList<>();
		d1Z.add("1");
		d1Z.add("2");
		d1Z.add("3");
		d1Z.add("4");
		Dice d1 = new Dice(d1X, d1Y, d1Z);

		List<String> d2X = new ArrayList<>();
		d2X.add("1");
		d2X.add("2");
		d2X.add("3");
		d2X.add("4");
		List<String> d2Y = new ArrayList<>();
		d2Y.add("1");
		d2Y.add("2");
		d2Y.add("3");
		d2Y.add("4");
		List<String> d2Z = new ArrayList<>();
		d2Z.add("1");
		d2Z.add("2");
		d2Z.add("3");
		d2Z.add("4");
		Dice d2 = new Dice(d2X, d2Y, d2Z);

		List<String> d3X = new ArrayList<>();
		d3X.add("1");
		d3X.add("3");
		d3X.add("3");
		d3X.add("4");
		List<String> d3Y = new ArrayList<>();
		d3Y.add("1");
		d3Y.add("2");
		d3Y.add("3");
		d3Y.add("4");
		List<String> d3Z = new ArrayList<>();
		d3Z.add("1");
		d3Z.add("2");
		d3Z.add("3");
		d3Z.add("4");
		Dice d3 = new Dice(d3X, d3Y, d3Z);


		Game game = new Game();
		
//		System.out.println("prima: \n--------------------" 
//				+ d1.getPosition());
//		System.out.println("###################################");
//
//		for (int i = 0; i < 14; i++) {
//			
//			d1.nextState();
//			
//			System.out.println(d1.getPosition());
//			System.out.println("################################### i=" 
//					+ String.valueOf(i));
//		}
//
//		Set<String> set = new HashSet<String>(asseY);
//
//		boolean isUnique = asseY.size() == set.size();
//
//		System.out.println(
//			"l'asse ha valori unici? " + String.valueOf(isUnique));
//		System.out.println("List = " + asseY.toString()
//		+ "size = " + String.valueOf(asseY.size()));
//		System.out.println("Set = " + set.toString()
//		+ "size = " + String.valueOf(set.size()));
	}

}
