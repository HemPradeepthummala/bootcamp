package com.tw.bootcamp.problem3;

public class Centimeter {

	private final int centimeter;

	public Centimeter(int centimeter) {
		this.centimeter = centimeter;
	}

	public double toInch() {
		return  centimeter / 2.5;
	}

}
