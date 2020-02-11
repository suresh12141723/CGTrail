package com.cg.Lab1;

public class Excercise4 {
	boolean checkNumber(int numberToCheck)
	 {
		 for(int currentNumber=2;currentNumber<=numberToCheck;currentNumber*=2)
		 {
			 if(currentNumber==numberToCheck)
				 return true;
		 }
		 return false;
	 }


}
