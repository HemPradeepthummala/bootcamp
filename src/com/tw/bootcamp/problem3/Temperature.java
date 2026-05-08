package com.tw.bootcamp.problem3;

public class Temperature {
	private final double value;
	private final TemparatureUnit unit;

	public Temperature(double value, TemparatureUnit unit) {
		this.value = value;
		this.unit = unit;
	}

	public boolean compare(Temperature other) {
		return this.unit.convertTo(value) == other.unit.convertTo(other.value);
	}

	@Override
	public String toString() {
		return "Temperature{" +
				"value=" + value +
				", unit=" + unit +
				'}';
	}
}
