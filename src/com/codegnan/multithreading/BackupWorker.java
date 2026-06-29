package com.codegnan.multithreading;

public class BackupWorker implements Runnable{
	private final String workerName;
 public BackupWorker(String workerName) {
	   {
		 this.workerName=workerName;
	 }
 }
	@Override
	public void run() {
	System.out.println(workerName+"starting work");
	for(int i=0;i<=5;i++) {
		System.out.println(workerName+"prcessing file back");
		if(i%2==0) {
			System.out.println(workerName+"Yielding control");
		 Thread.yield();
		}System.out.println("Startig backup work");
	}
		
	}

}
