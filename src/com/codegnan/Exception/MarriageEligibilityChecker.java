package com.codegnan.Exception;

public class MarriageEligibilityChecker { 	
 	public void checkEligibility(int age) throws TooYoungException, TooOldException {
      	if (age < 18) {
          	throw new TooYoungException("Marriage cannot be approved: Age is below 18 years.");
      	} else if (age > 60) {
          	throw new TooOldException("Marriage cannot be approved: Age is above 60 years.");
      	} else {
          	System.out.println("Marriage approved! Details will be processed soon.");
          	
      	}
 	}
 	 	public static void main(String[] args) {
      	MarriageEligibilityChecker checker = new MarriageEligibilityChecker();
 
      	try {
          	checker.checkEligibility(20);
          	checker.checkEligibility(16);
          	checker.checkEligibility(65);
 
      	} catch (TooYoungException e) {
          	System.out.println("Exception caught: " + e.getMessage());
      	} catch (TooOldException e) {
          	System.out.println("Exception caught: " + e.getMessage());
          	// Additional handling logic can be added here
      	}
 	}
}

