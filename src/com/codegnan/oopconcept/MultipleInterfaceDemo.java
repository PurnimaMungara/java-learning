package com.codegnan.oopconcept;

public class MultipleInterfaceDemo {
	public static void Main(String args[]) {
		Human human=new Human("Purnima");
		Robot robot=new Robot("R2D2");
		System.out.println("Human Daily");
		
		human.Work();
		human.Work();
		human.takeBreak();
		human.eat();
		human.digest();
		human.work();
		human.sleep();
		human.wakeUp();
		System.out.println("Robot operations");
		robot.work();
		robot.work();
		robot.work();
		robot.work();
		robot.work();
		robot.work();
		robot.takeBreak();
		robot.charge();
		robot.work();
	}

}
