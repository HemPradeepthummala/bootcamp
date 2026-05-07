package com.tw.bootcamp.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChanceTest {
	@Test
	void chanceOfGettingTails() throws InvalidProbabilityRangeException {
		Chance chance = Chance.of(0.5);
		assertEquals(Chance.of(0.5),chance);
	}

	@Test
	void chanceOfNotGetting() throws InvalidProbabilityRangeException {
		Chance chance = Chance.of(0.3).not();
		assertEquals(Chance.of(0.7),chance);
	}

	@Test
	void chanceOfGettingTailsInTwoCoins() throws InvalidProbabilityRangeException {
		Chance chance = Chance.of(0.5);
		Chance and = chance.and(Chance.of(0.5));
		assertEquals(Chance.of(0.25), and);
	}

	@Test
	void chanceOfGettingAValueOnDice() throws InvalidProbabilityRangeException {
		Chance chance = Chance.of(0.16);
		assertEquals(Chance.of(0.16), chance);
	}

	@Test
	void chanceOfGettingAtleastOneTail() throws InvalidProbabilityRangeException {
		Chance chance = Chance.of(0.5).or(Chance.of(0.5));
		assertEquals(Chance.of(0.75),chance);
	}

	@Test
	void DemorgansLaw() throws InvalidProbabilityRangeException {
		Chance chance = Chance.of(0.5).demorgon(Chance.of(0.5));
		assertEquals(Chance.of(0.75),chance);
	}
	@Test
	void invaildProbabilityRange() throws  InvalidProbabilityRangeException {
		InvalidProbabilityRangeException exception = assertThrows(InvalidProbabilityRangeException.class, () -> Chance.of(1.5));
		assertEquals(exception.getMessage(),"Invalid Range");
	}
}
