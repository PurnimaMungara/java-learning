package com.codegnan.oop;

public class BookFine {
	int id;
	String type;
	public int getId() {
		return id;
	}
	public BookFine(int id) {
		this .id=id;
	}
	public BookFine(int id,String type) {
		this.id=id;
		this.type=type;
		
	}
	public int calculateFine(int days) {
		int fine=days*5;
		if(fine>=1000) {
			fine=1000;
		}
		return fine;
	}
	public int claculateFine(int days,String type) {
		int fine=0;
		if(type.equalsIgnoreCase("Premium")){
			fine=days*3;
		}
	
	if(fine>=1000) {
		fine=1000;
	}
	return fine;
}
public int calculateFine(int days,int fixedCost) {
	int fine=days*5+fixedCost;
	if(fine>1000) {
		fine=1000;
	}
	return fine;

}
}

