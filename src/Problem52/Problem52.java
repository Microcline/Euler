package Problem52;

public class Problem52 {
	public static void main(String [] args) {
		findX();
	}

	/**
	 * A method to find x, 2x, 3x, 4x, 5x, 6x that have the same digits and same
	 * amount of digits
	 */
	private static void findX() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 1000000000; i++) {
			if(sameDigits(2 * i, i) && sameLength(2 * i, i)) {
				if(sameDigits(3 * i, i) && sameLength(3 * i, i)) {
					if(sameDigits(4 * i, i) && sameLength(4* i, i)) {
						if(sameDigits(5 * i, i) && sameLength(5 * i, i)) {
							if(sameDigits(6 * i, i) && sameLength(6 * i, i)) {
								System.out.println(i);	// solution found
							}
						}
					}
				}
			}
		}
		
	}
	
	public static boolean sameDigits(int digit1, int digit2) {
		// loop through string characters and see if contain same digits
		for(int i = 0; i < Integer.toString(digit1).length(); i++) {	//
			if(Integer.toString(digit2).contains(Integer.toString(digit1).charAt(i))) {	// if digit2 contains all the characters of digit1
			if(String.valueOf(digit2).contains(Integer.toString(digit1).charAt(i))) {
			if(Integer.toString(digit2).contains(digit1));
				
			}
				// do nothing
			}
			else { 	// digit1 and digit2 don't contain the same numbers
				return false;
			}
		}
		// if we make it through, we can return true: both numbers contain the 
		// same digits
		return true;
	}
	
	public static boolean sameLength(int digit1, int digit2) {
		if(Integer.toString(digit1).length() == Integer.toString(digit2).length()) {
			return true;
		}
		else return false;
	}
}
