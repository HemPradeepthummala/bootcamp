package com.tw.bootcamp.package4;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class parkingLotTest {

	@Test
	void parkingLot() {
		ParkingLot parkingLot = ParkingLot.createParkingLot(5, 5);
		parkingLot.park();
		parkingLot.park();
		parkingLot.park();
		assertTrue(parkingLot.park());
	}

	@Test
	void ParkingLotFull() {
		ParkingLot parkingLot = ParkingLot.createParkingLot(1,1);
		parkingLot.park();
		RuntimeException runtimeException = assertThrows(RuntimeException.class, () -> parkingLot.park());
	}

	@Test
	void  checkIsFull() {
		ParkingLot parkingLot = ParkingLot.createParkingLot(1,1);
		parkingLot.park();
		assertTrue(parkingLot.isFull());
	}

}