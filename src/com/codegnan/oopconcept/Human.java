package com.codegnan.oopconcept;

public class Human  implements Workable,Eatable,Sleepable{

private String name;
private boolean isAwake;
private boolean isWorkable;
private int energyLevel;
private int eneryLevel;
private boolean isWorking;
public Human(String name) {
	this.name=name;
	this.isAwake=true;
	this.isWorkable=false;
	this.eneryLevel=100;
}
public void Work() {
	if(isAwake && energyLevel>20) {
		isWorking =true;
		energyLevel-=20;
		System.out.println(name +"is working,Energy Level"+energyLevel);
	}
	else {
		System.out.println(name+"is too tired too work");
	}
}
public void takeBresk() {
	if(isWorkable) {
		isWorkable=false;
		energyLevel+=10;
		System.out.println(name+"is taking a break.Energy Level:"+energyLevel);
	}
}
public void eat() {
	energyLevel+=30;
	if(energyLevel>100) {
		energyLevel=100;
		System.out.println(name+"is eating.Eating Level:'+energyLevel");
	}
}
public void sleep() {
	isAwake=false;
	isWorking=false;
	energyLevel=100;
	System.out.println(name+"is Sleeping.Energy Restored to:"+energyLevel);
	public void wakeUp();
	System.out.println(name+"wake up refreshed");
	
}

}