package com.tw.bootcamp.problem3;

public class Inch {
	private final int value;

	public Inch(int inch) {
		this.value = inch;
	}

	public static Inch toInch(Feet feet) {
		return new Inch(feet.toInch());
	}

	public int toFeet() {
		return  value / 12;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;

		Inch inch = (Inch) o;
		return value == inch.value;
	}

	@Override
	public int hashCode() {
		return value;
	}
}

