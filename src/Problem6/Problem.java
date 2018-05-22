package Problem6;

/*
 * 
The sum of the squares of the first ten natural numbers is,
1^2 + 2^2 + ... + 10^2 = 385

The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)^2 = 55^2 = 3025

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 - 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */

/**
 * 
 * @author Jacob
 * @date 5 July 2014
 * Correct on the first try!  I'm getting better at this.
 */
public class Problem {
	
	public static void main(String [] args) {
		int solution = squareSum(100) - sumSquare(100); 
		System.out.println(solution);
	}

	/*
	 * sumSquare adds all of the sum of the squares of the given integer argument
	 */
	private static int sumSquare(int naturalNumber) {
		int total = 0;
		for(int i = 1; i <= naturalNumber; i++) {
			total += (i*i);
		}
		return total;
	}
	
	/*
	 * squareSum adds all of the square of the sum of the given integer argument
	 */
	private static int squareSum(int naturalNumber) {
		int total = 0;
		for(int i = 0; i <= naturalNumber; i++) {
			total += i;
		}
		return total * total;
	}
	
}
