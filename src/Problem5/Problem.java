package Problem5;
/**
 * 
 * @author Jacob
 * Correct on first try!  That feels nice.
 */



/*
 *
	2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 	What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * 
 * 
 */

/*
 * First of all, we'll create a counter to increment
 * Then, check the common-sense numbers against it to see if all of them are evenly divisible
 * These numbers include:
 * 11, 12, 13, 14, 15, 16, 17, 18, 19, and 20
 * If the last element of the array passes the divisibility test, then return the counter
 * If any element of the array doesn't pass the divisibility test, then increment the counter, and set array index to 0
 * 
 * 
 * 
 * 1. check arr idx 0
 * 2. if divisible, check arr idx 1 and so on
 * 3. if not divisible, reset arr idx to 0 and increment counter
 */


public class Problem {
	//public static int counter = 21;
	public static int [] numArray = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
	
	public static void main(String [] args) {
		int solution = divisibilityTest(numArray);
		System.out.println(solution);
	}

	private static int divisibilityTest(int[] numArray) {
		int idx = 0;
		int counter = 21;
		while(idx < numArray.length) {
			if(counter % numArray[idx] == 0) {
				idx++;
			}
			else {
				idx = 0;
				counter++;
			}
		}
		return counter;
		
		/*
		for(int idx = 0; idx < numArray.length; idx++) {
			
			
			counter++;
		}
		return counter;
		*/
	}
	
}

