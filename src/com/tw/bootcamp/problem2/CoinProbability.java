package com.tw.bootcamp.problem2;

public class CoinProbability {
	private final double totalOutComes;
	private final double totalFavorableOutComes;

	private CoinProbability(double totalOutComes, double totalFavorableOutComes) {
		this.totalOutComes = totalOutComes;
		this.totalFavorableOutComes = totalFavorableOutComes;
	}

	public static CoinProbability createCoinProbability(int coins) {
		double totalOutComes = Math.pow(2,coins);
		double totalFavorableOutComes = (Math.pow(2,coins)-1);
		return new CoinProbability(totalOutComes, totalFavorableOutComes);
	}

	public double flippingProbability() {
		return  totalFavorableOutComes / totalOutComes;
	}
}

