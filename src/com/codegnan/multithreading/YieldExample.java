package com.codegnan.multithreading;

public class YieldExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BackupWorker backupTask1=new BackupWorker("Backup-Worker-A");
		BackupWorker backupTask1=new BackupWorker("Backup-Worker-B");
		Thread worker=new Thred(backupTask1);
		Thread worker1=new Thred(backupTask2);
		workerA.setPriority(Thread.NORM_PRIORITY);
		workerB.setPriority(Thread.NORM_PRIORITY);
		

	}

}
