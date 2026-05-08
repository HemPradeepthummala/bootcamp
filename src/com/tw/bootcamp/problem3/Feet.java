package com.tw.bootcamp.problem3;

public class Feet {
	final private double value;

	private Feet(double value) {
		this.value = value;
	}

	public static Feet createFeet(double value) {
		return new Feet(value);
	}

	public double toInch() {
		return  value * 12;
	}
}
