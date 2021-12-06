package it.bastio.resolver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import it.bastio.resolver.model.Dice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> asseX = new ArrayList<>();
		asseX.add("1");
		asseX.add("2");
		asseX.add("3");
		asseX.add("4");
		List<String> asseY = new ArrayList<>();
		asseY.add("1");
		asseY.add("2");
		asseY.add("3");
		asseY.add("4");
		List<String> asseZ = new ArrayList<>();
		asseZ.add("1");
		asseZ.add("2");
		asseZ.add("3");
		asseZ.add("4");

		Dice d1 = new Dice(asseX, asseY, asseZ);


		System.out.println("prima: \n--------------------" 
				+ d1.getPosition());
		System.out.println("###################################");

		for (int i = 0; i < 14; i++) {
			
			d1.nextState();
			
			System.out.println(d1.getPosition());
			System.out.println("################################### i=" 
					+ String.valueOf(i));
		}

		Set<String> set = new HashSet<String>(asseY);

		boolean isUnique = asseY.size() == set.size();

		System.out.println(
			"l'asse ha valori unici? " + String.valueOf(isUnique));
		System.out.println("List = " + asseY.toString()
		+ "size = " + String.valueOf(asseY.size()));
		System.out.println("Set = " + set.toString()
		+ "size = " + String.valueOf(set.size()));
	}

}
