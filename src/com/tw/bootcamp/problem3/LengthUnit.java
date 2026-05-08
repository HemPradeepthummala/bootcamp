package com.tw.bootcamp.problem3;

public enum LengthUnit {
	IN(2.5),
	CM(1),
	Feet(30),
	MM(.1);

	private final double conversionDelta;

	LengthUnit(double conversionDelta) {
		this.conversionDelta = conversionDelta;
	}

	public double convert(double value) {
		return value * conversionDelta;
	}
}
