package com.tw.bootcamp.problem3;

public class Inch {
	private final double value;

	private Inch(double inch) {
		this.value = inch;
	}

	public static Inch createInch(double inch) {
		return new Inch(inch);
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;

		Inch inch = (Inch) o;
		return value == inch.value;
	}

	@Override
	public int hashCode() {
		return Double.hashCode(value);
	}

	public Boolean compareWithInches(Feet feet) {
		return  equals(createInch(feet.toInch()));
	}

	public boolean compareWithCentimeter(Centimeter centimeter) {
			return equals(createInch(centimeter.toInch()));
	}
}

