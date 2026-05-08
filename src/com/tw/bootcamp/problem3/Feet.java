package com.tw.bootcamp.problem3;

public class Feet {
	final private   int value;

	public Feet(int value) {
		this.value = value;
	}

	public int toInch() {
		return  value * 12;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;

		Feet feet = (Feet) o;
		return value == feet.value;
	}

	@Override
	public int hashCode() {
		return value;
	}

}
