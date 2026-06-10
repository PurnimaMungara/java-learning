package com.codegnan.oop;

public class Box {
	double width;
	double height;
	double depth; //Instance variable
	public void Volume() {
		System.out.println("Box Height");
		System.out.println("Box Depth");
		System.out.println("Box width");
		 double Volume=width*height*depth;
		 System.out.println("Box Volume is:" +Volume);
	}

	public static void main(String[] args) {
		Box mybox1=new Box();
		mybox1.Volume();
		Box mybox2=new Box();
		mybox2.height=12.7;
		mybox2.Volume();
		
		// TODO Auto-generated method stub

	}

}
