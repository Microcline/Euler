package Problem36;

/*
 * 
 * 
The decimal number, 585 = 10010010012 (binary), is palindromic in both bases.

Find the sum of all numbers, less than one million, which are palindromic in base 10 and base 2.

(Please note that the palindromic number, in either base, may not include leading zeros.)

 */

/*
 * 1. Make a counter
 * 1.1 Make a total
 * 2. Check to see if counter is a palindrome in base 10
 * 3. Check to see if counter is a palindrome in base 2
 * 3.1 Use Integer.toBinaryString()
 * 3.2 Use Integer.parseInt("")
 * 4. If it is a palindrome, add the base 10 number(counter) to the total
 */

/**
 * 
 * @author Jacob
 * @date 5 July 2014 4:37PM
 * Correct on the first try!  I'm feeling a lot more confident.
 */

public class Problem36 {
	//public static int counter = 0;
	public static int total = 0;
	
	public static void main(String [] args) {
		for(int counter = 0; counter < 1000000; counter++) {
			if(isPalindrome(Integer.toBinaryString(counter)) //Binary palindrome check 
					&& isPalindrome(Integer.toString(counter))) { //Decimal palindrome check
				total += counter;
			}
		}
		System.out.println(total);
	}
	
	public static boolean isPalindrome(String input) {		
		//Base case
		if(input.length() < 2) {
			return true;
		}
		else if(input.charAt(0) == input.charAt(input.length() - 1)) {
			return isPalindrome(input.substring(1,  input.length() - 1)); 
		}		
		return false;
	}
}
