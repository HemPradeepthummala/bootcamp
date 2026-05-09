package com.tw.bootcamp.problem4;

import java.util.HashMap;
import java.util.Set;

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

	public boolean park() {
		ParkingLot parkingLot = getAvailableParkingLot();

		if(!(parkingLot instanceof ParkingLot)){
			throw  new RuntimeException("No lots Available");
		}

		return parkingLot.park();
	}

	private ParkingLot getAvailableParkingLot() {
		for (String id : parkingLots.keySet()) {
			if(!parkingLots.get(id).isFull()) {
				return parkingLots.get(id);
			}
		}
		return null;
	}
}
