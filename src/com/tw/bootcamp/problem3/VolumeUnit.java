package com.tw.bootcamp.problem3;

public enum VolumeUnit {
	L(1),
	GAL(3.78);

	private final double conversionDelta;

	VolumeUnit(double conversionDelta) {
		this.conversionDelta = conversionDelta;
	}

	public double convert(double value) {
		return value * conversionDelta;
	}
}
