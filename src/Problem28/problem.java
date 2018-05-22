package Problem28;
/*
Starting with the number 1 and moving to the right in a clockwise direction a 5 by 5 spiral is formed as follows:
21 22 23 24 25
20  7  8  9 10
19  6  1  2 11
18  5  4  3 12
17 16 15 14 13
It can be verified that the sum of the numbers on the diagonals is 101.
What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral formed in the same way?
 */

/*
 * 1. Form an array of 1001x1001
 * 2. Fill the array with spiral numbers
 * 3. Add diagonals all together
 */

public class problem {
	static int [][] array = new int[1001][1001]; 
	public static void main(String [] args) {
		fillSpiral(array);
	}
	/*This method fills a 2D array in a spiral pattern*/
	
	private static void fillSpiral(int[][] array2) {
				
	}
}
