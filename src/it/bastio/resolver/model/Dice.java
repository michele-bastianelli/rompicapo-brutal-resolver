package it.bastio.resolver.model;

import java.util.ArrayList;
import java.util.List;

import it.bastio.resolver.constants.DiceConstants;

public class Dice {
	private List<String> axis;
	private List<String> x;
	private List<String> y;
	private List<String> z;
	private int rotation;

	public Dice() {
		this.axis = new ArrayList<String>();
		this.axis.add(DiceConstants.X);
		this.axis.add(DiceConstants.Y);
		this.axis.add(DiceConstants.Z);
		this.x = new ArrayList<String>();
		this.y = new ArrayList<String>();
		this.z = new ArrayList<String>();
		this.rotation = 0;
	}

	public Dice(List<String> x, List<String> y, List<String> z) {
		this.axis = new ArrayList<String>();
		this.axis.add(DiceConstants.X);
		this.axis.add(DiceConstants.Y);
		this.axis.add(DiceConstants.Z);
		this.x = x;
		this.y = y;
		this.z = z;
		this.rotation = 0;
	}

	public String nextState() {
		if (this.rotation == DiceConstants.ROTATION_NUMBER) {
			String first = this.axis.remove(0);
			this.axis.add(first);
			this.rotation = 0;
		}
		else {
			doRotation(this.axis.get(0));
		}
		return this.getPosition();
	}
	/**
	 * Esegue una rotazione del dado sull'asse specificato.
	 * 
	 * @param axis = asse di rotazione.
	 * @return numero della rotazione
	 */
	private int doRotation(String axis) {
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

	private int doXRotation() {
		int rot = this.rotation;
		String first = this.x.remove(0);
		this.x.add(first);
		if (rot == DiceConstants.ROTATION_NUMBER) {
			rot = 0;
		}
		else {
			rot++;
		}
		this.rotation = rot;
		return this.rotation;
	}

	private int doYRotation() {
		int rot = this.rotation;
		String first = this.y.remove(0);
		this.y.add(first);
		if (rot == DiceConstants.ROTATION_NUMBER) {
			rot = 0;
		}
		else {
			rot++;
		}
		this.rotation = rot;
		return this.rotation;
	}

	private int doZRotation() {
		int rot = this.rotation;
		String first = this.z.remove(0);
		this.z.add(first);
		if (rot == DiceConstants.ROTATION_NUMBER) {
			rot = 0;
		}
		else {
			rot++;
		}
		this.rotation = rot;
		return this.rotation;
	}

	//TODO getCurrentAxis
	/**
	 * verifica l'orientation del dado 
	 * e restituisce l'asse corrispondente
	 * 
	 * @return asse di rotazione
	 */
	public List<String> getCurrentAxis() {
		switch (this.axis.get(0)) {
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

	//TODO GET POSITION
	/**
	 * Restituisce la descriione della posizione attuale del dado
	 * comprensiva di: Asse, Rotazione, elenco di colori.
	 * 
	 * @return String descrizione
	 */
	public String getPosition() {
		String position = "Axis: " + this.getOrientation() + "\n"
			+ "Rotation: " + String.valueOf(this.rotation) + "\n"
			+ "Colori: " + this.getCurrentAxis().toString();

		return position;
	}

	public String getOrientation() {
		return axis.get(0);
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

}
