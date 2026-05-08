package com.tw.bootcamp.problem3;

public class Inch {
	private final double value;

	public Inch(double inch) {
		this.value = inch;
	}

	public double toFeet() {
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
		return Double.hashCode(value);
	}

	public Boolean compareWithOtherType(Feet feet) {
		return  equals(new Inch(feet.toInch()));
	}

	public boolean compareWithCentimeter(Centimeter centimeter) {
			return equals(new Inch(centimeter.toInch()));
	}

}

