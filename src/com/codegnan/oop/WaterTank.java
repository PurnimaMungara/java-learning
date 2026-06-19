package com.codegnan.oop;

import java.util.Scanner;

public class WaterTank {
  private int currentLevel=0;
  private int maxLevel=0;
  public void setcurrentLevel(int currentLevel) {
  if(currentLevel>0 && currentLevel<=500) {
	  this.currentLevel=currentLevel;
	  
  
  if(currentLevel>maxLevel) {
	  maxLevel=currentLevel;
  }
  }
}
  public int getCurrentLevel() {
	  return currentLevel;
  }
  public int getmaxLevel() {
	  return maxLevel;
  
}
  public static void main(String arg[]) {
	  Scanner sc=new Scanner(System.in);
	  WaterTank watertank=new WaterTank();
	  int level;
	  while(true) {
		  level=sc.nextInt();
		  if(level==999) {
			  break;
		  }
		  watertank.setcurrentLevel(level);
	  }
	  System.out.println(watertank.getCurrentLevel());
	  System.out.println(watertank.getmaxLevel());
	  sc.close();
  }
}


