package com.tw.bootcamp.problem3;

public enum AllUnits {
	IN(2.5),
	CM(1),
	Feet(30),
	MM(.1);

	private final double conversionDelta;

	AllUnits(double conversionDelta) {
		this.conversionDelta = conversionDelta;
	}

	public double convertTo(double value) {
		return value * conversionDelta;
	}

	public double convertFrom(double baseValue) {
		return baseValue/conversionDelta;
	}
}