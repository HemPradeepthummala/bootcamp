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
		Chance chance = Chance.and(0.5, 2);
		assertEquals(new Chance(0.25), chance);
	}

	@Test
	void chanceOfGettingAValueOnDice() {
		Chance chance = Chance.of(0.16);
		assertEquals(new Chance(0.16), chance);
	}

	@Test
	void chanceOfGettingAtleastOneTail() {
		Chance chance = Chance.atleastOnce(0.5);
		assertEquals(new Chance(0.75),chance);
	}
}
