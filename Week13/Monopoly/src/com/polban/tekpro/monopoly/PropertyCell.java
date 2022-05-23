package com.polban.tekpro.monopoly;

public class PropertyCell extends OwnedCell {
	private String colorGroup;
	private int housePrice;
	private int numHouses;
	private int rent;
	private int sellPrice;

	public String getColorGroup() {
		return colorGroup;
	}

	public int getHousePrice() {
		return housePrice;
	}

	public int getNumHouses() {
		return numHouses;
	}
    
    public int getPrice() {
		return sellPrice;
	}

	public int getRent() { //REFACTORING EXTRACT METHOD
		int rentToCharge = rent;
		rentToCharge = rentForMonopolies(rentToCharge);
		if(numHouses > 0) {
			rentToCharge = rent * (numHouses + 1);
		}
		return rentToCharge;
	}

	private int rentForMonopolies(int rentToCharge) { //NEW METHOD
		String [] monopolies = owner.getMonopolies();
		for(int i = 0; i < monopolies.length; i++) {
			if(monopolies[i].equals(colorGroup)) {
				rentToCharge = rent * 2;
			}
		}
		return rentToCharge;
	}
//	public int getRent() { BEFORE REFACTORING
//		int rentToCharge = rent;
//		String [] monopolies = owner.getMonopolies();
//		for(int i = 0; i < monopolies.length; i++) {
//			if(monopolies[i].equals(colorGroup)) {
//				rentToCharge = rent * 2;
//			}
//		}
//		if(numHouses > 0) {
//			rentToCharge = rent * (numHouses + 1);
//		}
//		return rentToCharge;
//	}
	
//	public int getRent() { REFACTORING LINE 28-33 (2 parameters)
//	int rentToCharge = rent;
//	String [] monopolies = owner.getMonopolies();
//	rentToCharge = rentForMonopolies(rentToCharge, monopolies);
//	if(numHouses > 0) {
//		rentToCharge = rent * (numHouses + 1);
//	}
//	return rentToCharge;
//}
//
//private int rentForMonopolies(int rentToCharge, String[] monopolies) {
//	for(int i = 0; i < monopolies.length; i++) {
//		if(monopolies[i].equals(colorGroup)) {
//			rentToCharge = rent * 2;
//		}
//	}
//	return rentToCharge;
//}

	public void playAction() {
		Player currentPlayer = null;
		if(!isAvailable()) {
			currentPlayer = GameMaster.instance().getCurrentPlayer();
			if(owner != currentPlayer) {
				currentPlayer.payRentTo(owner, getRent());
			}
		}
	}

	public void setColorGroup(String colorGroup) {
		this.colorGroup = colorGroup;
	}

	public void setHousePrice(int housePrice) {
		this.housePrice = housePrice;
	}

	public void setNumHouses(int numHouses) {
		this.numHouses = numHouses;
	}

	public void setPrice(int sellPrice) {
		this.sellPrice = sellPrice;
	}

	public void setRent(int rent) {
		this.rent = rent;
	}
}
