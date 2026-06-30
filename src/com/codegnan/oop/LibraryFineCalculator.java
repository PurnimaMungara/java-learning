package com.codegnan.oop;

public class LibraryFineCalculator {
 
		public static int calculateTotalFine(int daysOverdue) {
			// validate input
			if (daysOverdue < 0) {
				return 0;
			} else {
				int fine = daysOverdue * 5;
				if (fine > 1000) {
					fine = 1000;
				}
				return fine;
			}
		
			}


		public int calculateBookFine(int days, String bookType) {
			if (days < 0) {
				return 0;
			} else {
				int rate = 0;
				if (bookType.equals("regular")) {
					rate = 2;
				} 
			else {
					if (bookType.equals("premium")) {
						rate = 3;
					}
			}
				
				int fine = days * rate;
				if (fine > 1000) {
					fine = 1000;
				}
				return fine;
			}
			}
		
				
			}


	
		
			
 
 
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	