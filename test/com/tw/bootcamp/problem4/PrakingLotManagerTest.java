package com.tw.bootcamp.problem4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class PrakingLotManagerTest {
	@Test
	void addAParkingLot() {
		ParkingLotManager manager = new ParkingLotManager();
		String lotId = manager.addNewParkingLot(2, 3);
		assertEquals("P1", lotId);
	}

	@Test
	void parkACar() {
		ParkingLotManager manager = new ParkingLotManager();
		String lotId = manager.addNewParkingLot(2, 3);
		assertTrue(manager.park());
	}

	@Test
	void parkForUnAvailableLots() {
		ParkingLotManager manager = new ParkingLotManager();
		RuntimeException exception = assertThrows(RuntimeException.class, manager::park);
		assertEquals("No lots Available", exception.getMessage());
	}
}
