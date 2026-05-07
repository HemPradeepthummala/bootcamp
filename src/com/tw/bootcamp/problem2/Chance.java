package com.tw.bootcamp.problem2;

public class Chance {

	private final double probability;

	Chance(double probability) {
		this.probability = probability;
	}

	public static Chance of(double probability) {
		return new Chance(probability);
	}

	public static Chance and(double probabilityOfEach, double numOfItems) {
		return of(Math.pow(probabilityOfEach, numOfItems));
	}

	public static Chance atleastOnce(double probability) {
	return of(probability+(1-probability) - probability * (1 - probability));
	}

	public  Chance not() {
		return Chance.of(1 - this.probability);
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;

		Chance chance = (Chance) o;
		return Double.compare(probability, chance.probability) == 0;
	}

	@Override
	public int hashCode() {
		return Double.hashCode(probability);
	}
}
