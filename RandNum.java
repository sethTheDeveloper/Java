/*
@ Author: Seth Westphal
@ Definition: Number generator that returns a finite String of digits specified in the parameter passed to the constructor;
@ Version: 08.01.2017
*/

import java.util.*;

public class RandNum{

	// Random number generator object
	Random randomNum = new Random();
	
	// Storing the passed num in the constructor
	private int digitCount;
	
	// Storing the incrementation of digits.
	private String value;

	public RandNum(int digitCount){
	
		this.digitCount = digitCount;
	}
	
	public String generate(){
		String passedNum = "";
		switch (digitCount){
			case 1: passedNum = oneNum(); break;
			case 2: passedNum = twoNum(); break;
			case 3: passedNum = threeNum(); break;
			case 4: passedNum = fourNum(); break;
			case 5: passedNum = fiveNum(); break;
		}
		return passedNum;
	}
	
	public String oneNum(){
		value = "";
		
		value += Integer.toString(randomNum.nextInt(9));

		return value;		
	}
	public String twoNum(){
		value = "";
		
		value += Integer.toString(randomNum.nextInt(9));
		value += Integer.toString(randomNum.nextInt(9)); 

		return value;		
	}
	public String threeNum(){
		value = "";
		
		value += Integer.toString(randomNum.nextInt(9));
		value += Integer.toString(randomNum.nextInt(9)); 
		value += Integer.toString(randomNum.nextInt(9));

		return value;		
	}
	public String fourNum(){
		value = "";
		
		value += Integer.toString(randomNum.nextInt(9));
		value += Integer.toString(randomNum.nextInt(9)); 
		value += Integer.toString(randomNum.nextInt(9));
		value += Integer.toString(randomNum.nextInt(9));

		return value;
	}
	public String fiveNum(){
		
		value = "";
		
		value += Integer.toString(randomNum.nextInt(9));
		value += Integer.toString(randomNum.nextInt(9)); 
		value += Integer.toString(randomNum.nextInt(9));
		value += Integer.toString(randomNum.nextInt(9));
		value += Integer.toString(randomNum.nextInt(9));

		return value;
	}
	
}