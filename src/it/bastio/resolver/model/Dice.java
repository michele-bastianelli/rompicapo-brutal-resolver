package it.bastio.resolver.model;

import java.util.ArrayList;
import java.util.List;

import it.bastio.resolver.constants.DiceConstants;

public class Dice {
	private String orientation;
	private List<String> x;
	private List<String> y;
	private List<String> z;
	private int xRotation;
	private int yRotation;
	private int zRotation;

	public Dice() {
		this.orientation = DiceConstants.X;
		this.x = new ArrayList<String>();
		this.y = new ArrayList<String>();
		this.z = new ArrayList<String>();
		this.xRotation = 0;
		this.yRotation = 0;
		this.zRotation = 0;
	}

	public Dice(List<String> x, List<String> y, List<String> z) {
		this.orientation = DiceConstants.X;
		this.x = x;
		this.y = y;
		this.z = z;
		this.xRotation = 0;
		this.yRotation = 0;
		this.zRotation = 0;
	}

	/**
	 * Esegue una rotazione del dado sull'asse specificato.
	 * 
	 * @param axis = asse di rotazione.
	 * @return numero della rotazione
	 */
	public int doRotation(String axis) {
		int rotation = -1;
		switch (axis.toUpperCase()) {
		case DiceConstants.X:
			rotation = this.doXRotation();
			break;
		case DiceConstants.Y:
			rotation = this.doYRotation();
			break;
		case DiceConstants.Z:
			rotation = this.doZRotation();
			break;
		}
		return rotation;
	}

	public int doXRotation() {
		int rotation = this.xRotation;
		String first = this.x.get(0);
		this.x.add(first);
		if (rotation == 3) {
			rotation = 0;
		}
		else {
			rotation++;
		}
		this.xRotation = rotation;
		return this.xRotation;
	}

	public int doYRotation() {
		int rotation = this.yRotation;
		String first = this.y.get(0);
		this.y.add(first);
		if (rotation == 3) {
			rotation = 0;
		}
		else {
			rotation++;
		}
		this.yRotation = rotation;
		return this.yRotation;
	}

	public int doZRotation() {
		int rotation = this.zRotation;
		String first = this.z.get(0);
		this.z.add(first);
		if (rotation == 3) {
			rotation = 0;
		}
		else {
			rotation++;
		}
		this.zRotation = rotation;
		return this.zRotation;
	}

	//TODO getCurrentAxis
	/**
	 * verifica l'orientation del dado 
	 * e restituisce l'asse corrispondente
	 * 
	 * @return asse di rotazione
	 */
	public List<String> getCurrentAxis() {
		switch (this.orientation) {
		case DiceConstants.X:
			return this.getX();
		case DiceConstants.Y:
			return this.getY();
		case DiceConstants.Z:
			return this.getZ();
		default:
			return new ArrayList<String>();
		}
	}

	/**
	 * Restituisce il valore di rotazione dell'asse corrente.
	 * 
	 * @returnint valore rotazione.
	 */
	public int getCurrentAxisRotation() {
		switch (this.orientation) {
		case DiceConstants.X:
			return this.xRotation;
		case DiceConstants.Y:
			return this.yRotation;
		case DiceConstants.Z:
			return this.zRotation;
		default:
			return -1;
		}
	}

	//TODO GET POSITION
	/**
	 * Restituisce la descriione della posizione attuale del dado
	 * comprensiva di: Asse, Rotazione, elenco di colori.
	 * 
	 * @return String descrizione
	 */
	public String getPosition() {
		String position = "Axis: " + this.getOrientation() + "\n"
			+ "Rotation: " + String.valueOf(this.getCurrentAxisRotation() + "\n"
			+ "Colori: " + this.getCurrentAxis().toString());

		return position;
	}

	public String getOrientation() {
		return orientation;
	}

	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}

	public List<String> getX() {
		return x;
	}

	public void setX(List<String> x) {
		this.x = x;
	}

	public List<String> getY() {
		return y;
	}

	public void setY(List<String> y) {
		this.y = y;
	}

	public List<String> getZ() {
		return z;
	}

	public void setZ(List<String> z) {
		this.z = z;
	}

	public int getxRotation() {
		return xRotation;
	}

	public void setxRotation(int xRotation) {
		this.xRotation = xRotation;
	}

	public int getyRotation() {
		return yRotation;
	}

	public void setyRotation(int yRotation) {
		this.yRotation = yRotation;
	}

	public int getzRotation() {
		return zRotation;
	}

	public void setzRotation(int zRotation) {
		this.zRotation = zRotation;
	}
}
