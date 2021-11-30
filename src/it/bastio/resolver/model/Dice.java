package it.bastio.resolver.model;

import java.util.ArrayList;
import java.util.List;

import it.bastio.resolver.constants.DiceConstants;

public class Dice {
	private List<String> x;
	private List<String> y;
	private List<String> z;
	private int xRotation;
	private int yRotation;
	private int zRotation;

	public Dice() {
		this.x = new ArrayList<String>();
		this.y = new ArrayList<String>();
		this.z = new ArrayList<String>();
		this.xRotation = 0;
		this.yRotation = 0;
		this.zRotation = 0;
	}

	public Dice(List<String> x, List<String> y, List<String> z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
		this.xRotation = 0;
		this.yRotation = 0;
		this.zRotation = 0;
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
		String first = this.x.get(0);
		this.x.add(first);
		return this.xRotation++;
	}

	public int doYRotation() {
		String first = this.y.get(0);
		this.y.add(first);
		return this.yRotation++;
	}

	public int doZRotation() {
		String first = this.z.get(0);
		this.z.add(first);
		return this.zRotation++;
	}
}
