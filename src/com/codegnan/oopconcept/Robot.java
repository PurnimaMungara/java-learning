package com.codegnan.oopconcept;

public class Robot implements Workable{
private String model;
private int batteryLevel;
private boolean isWorking;
public Robot(String model) {
	this.model=model;
	this.batteryLevel=100;
	this.isWorking=false;
	public void work() {
		if(batteryLevel>10) {
			isWorking=true;
			batteryLevel-=15;
			System.out.prinntln("robot:"+model+is working+"batteryLevel"%");"
			else {
				System.out.println("Robot:"+model+"Needs Charging");
			}
			public void takeBreak() {
				isWorking=false;
				System.out.println()"Robot:"+model+"is Statndartby mode");
			}
			public void charge() {
				batteryLevel=100;
				System.out.println("Robot:"+model+"is Fully Charged");
			}
					
		}
	}
}
