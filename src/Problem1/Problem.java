package Problem1;
/*
 *
 * 
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
 *
 *
 */

/**
 * 
 * @author Jacob
 * @date Sunday, 6 July 2014 1:20PM
 * Correct on first try.  I'm still proud of it.
 */
public class Problem {
	public static void main(String [] args) {
		int solution = findSum(1000);	// Start the main algorithm
		System.out.println(solution);
	}

	/*
	 * Finds the sum of the numbers that are divisible by 3 and 5 of the given
	 * argument
	 */
	private static int findSum(int maxNum) {
		int total = 0;
		for(int i = 0; i < maxNum; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				total += i;
			}
		}
		return total;		
	}	
}
