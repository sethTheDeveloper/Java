/*
@ Author: Seth Westphal
@ Definition: Main method dispatcher for a simulation of using the RandNum class.
@ Version: 08.01.2017
*/

import java.util.*;


public class Main{

	public static void main(String args[]){
		System.out.println("HELLO");
		RandNum rand = new RandNum(1);
		System.out.println("Random number 1: " + rand.generate());
		RandNum randTwo = new RandNum(2);
		System.out.println("Random number 2: " + randTwo.generate());
		RandNum randThree = new RandNum(3);
		System.out.println("Random number 3: " + randThree.generate());
		RandNum randFour = new RandNum(4);
		System.out.println("Random number 4: " + randFour.generate());
		RandNum randFive = new RandNum(5);
		System.out.println("Random number 5: " + randFive.generate());
	}
}