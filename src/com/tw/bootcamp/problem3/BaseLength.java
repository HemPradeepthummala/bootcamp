package com.tw.bootcamp.problem3;

public class BaseLength<T extends LengthUnit> {

	private final double value;
	private final LengthUnit unit;

	public BaseLength(double value, LengthUnit unit) {
		this.value = value;
		this.unit = unit;
	}

	public boolean compare(BaseLength other) {
		return this.unit.convert(value) == other.unit.convert(other.value);
	}
}
