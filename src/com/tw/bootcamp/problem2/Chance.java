package com.tw.bootcamp.problem2;

public class Chance {

	private double probability;

	Chance(double probability) {
		this.probability = probability;
	}

	public static Chance of(double probability) throws InvalidProbabilityRangeException {
		if(probability > 1 || probability < 0) {
			throw new InvalidProbabilityRangeException("Invalid Range");
		}
		return new Chance(probability);
	}

	public Chance and(Chance other) throws InvalidProbabilityRangeException {
		return of(this.probability * other.probability);
	}

	public Chance or(Chance other) throws InvalidProbabilityRangeException {
	return of(probability+ other.probability - probability * other.probability);
	}

	public  Chance not() throws InvalidProbabilityRangeException {
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

	public Chance demorgon(Chance chance) throws InvalidProbabilityRangeException {
		return  this.not().and(chance.not()).not();
	}
}
