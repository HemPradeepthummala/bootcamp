package com.tw.bootcamp.problem4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PrakingLotManagerTest {
	@Test
	void addAParkingLot() {
		ParkingLotManager manager = new ParkingLotManager();
		String lotId = manager.addNewParkingLot(2, 3);
		assertEquals("P1", lotId);
	}
}
