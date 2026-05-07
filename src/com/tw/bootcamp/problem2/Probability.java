package com.tw.bootcamp.problem2;

public class Probability {

	public double ChanceOfGettingTails() {
		return  this.caluculateProbability(2,1);
	}

	private double caluculateProbability(double totalOutComes, double totalFavorableOutComes) {
		return  totalFavorableOutComes / totalOutComes;
	}
}

