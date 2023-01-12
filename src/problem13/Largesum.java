package problem13;
/*
 *@author Jacob Sherrill
 *@date 26 November 2018
 */
public class Largesum {
	public static void main(String[] args) {	
		fizzbuzz();
	}
	
	/*
	 * Fizzbuzz concepts:
	 * Supersets before subsets
	 * Modular arithmetic
	 * Variable initialization
	 * For loops
	 * Method creation
	 * Standard output
	 */
	private static void fizzbuzz() {	
		for(int i = 0; i < 50; i++) {
			if((i % 3 == 0) && (i % 5 == 0)){ 
				System.out.println("Fizzbuzz " + i);
			}	
			else if(i % 3 == 0) {
				System.out.println("Fizz " + i);
			}
			else if(i % 5 == 0) { 
				System.out.println("Buzz " + i);
			}
		}
	}
}
