package com.tw.bootcamp.problem2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinProbabilityTest {
	@Test
	void chanceOfGettingTails() {
		CoinProbability coinProbability = CoinProbability.createCoinProbability(1);
		double tailsProbability = coinProbability.flippingProbability();
		assertEquals(0.5,tailsProbability);
	}

	@Test
	void notGettingTails() {
		CoinProbability coinProbability = CoinProbability.createCoinProbability(1);
		double tailsProbability = coinProbability.flippingProbability();
		assertEquals(0.5,tailsProbability);
	}

	@Test
	void propbabiltyOfGettingAtleastOneTail() {
		CoinProbability coinProbability = CoinProbability.createCoinProbability(2);
		double tailsProbability = coinProbability.flippingProbability();
		assertEquals(0.75,tailsProbability);
	}
}
