package com.tw.bootcamp.problem4;

import java.util.HashMap;

public class ParkingLotManager {
	private final HashMap<String,ParkingLot> parkingLots;
	private int id ;

	public ParkingLotManager() {
		this.id = 1;
		this.parkingLots = new HashMap<String,ParkingLot>();
	}

	public String addNewParkingLot(int length, int width) {
		String  lotId = getNextLotId();
		ParkingLot lot =  ParkingLot.createParkingLot(length,width,lotId);
		parkingLots.put(lotId,lot);
		return lotId;
	}

	private String getNextLotId() {
			return  "P"+id++;
	}

}
