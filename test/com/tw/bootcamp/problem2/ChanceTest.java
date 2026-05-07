package com.tw.bootcamp.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChanceTest {
	@Test
	void chanceOfGettingTails() {
		Chance chance = Chance.of(0.5);
		assertEquals(new Chance(0.5),chance);
	}

	@Test
	void chanceOfNotGetting() {
		Chance chance = Chance.of(0.3).not();
		assertEquals(new Chance(0.7),chance);
	}

	@Test
	void chanceOfGettingTailsInTwoCoins() {
		Chance chance = Chance.ofMultipleItems(0.5, 2);
		assertEquals(new Chance(0.25), chance);
	}
}
