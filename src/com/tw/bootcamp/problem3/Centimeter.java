package com.tw.bootcamp.problem3;

public class Centimeter {

	private final int centimeter;

	private Centimeter(int centimeter) {
		this.centimeter = centimeter;
	}

	public static Centimeter createCentimeter(int centimeter) {
		return new Centimeter(centimeter);
	}

	public double toInch() {
		return  centimeter / 2.5;
	}
}
