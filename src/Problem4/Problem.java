package Problem4;

public class Problem {
	private static int palProduct = 0;
	public static void main(String [] args) {
		//Counts up to and including all three-digit integers
		System.out.println(palProduct());
	}


	/*
	 * A recursive method to see if a String is a palindrome
	 */
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
	
	public static int palProduct() {
		for(int i = 100; i < 1000; i++) {
			for(int j = 100; j < 1000; j++) {
				//Convert the product to a String
				String pal = Integer.toString(i * j);
				if(isPalindrome(pal)) {
					if((i * j) > palProduct) {
						palProduct = (i * j);
					}
				}
				System.out.println("palProduct = " + palProduct);
			}
		}
		return palProduct;
	}
}
