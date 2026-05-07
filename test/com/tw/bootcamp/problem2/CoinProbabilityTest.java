package com.tw.bootcamp.problem2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinProbabilityTest {
	@Test
	void ChanceOfGettingTails() {
		Probability probability = new Probability();
		double tailsProbability = probability.ChanceOfGettingTails();
		assertEquals(0.5,tailsProbability);
	}
}
