package Problem3;

import java.util.Vector;

/*
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */

/**
 * 
 * @author Jacob
 * @date Sunday, 6 July 2014 4:00PM
 * Man, I really messed this one up
 * I tried an iterative, incremental algorithm and it was taking forever
 * I knew beforehand that it was the wrong choice, smart vs. power and all that
 * I just didn't have the knowhow for a prime number algorithm
 * 
 */
public class Problem {
	public static void main(String [] args) {
		Vector factorArray = prime_factors(600851475143.0);
		System.out.println(factorArray.get(factorArray.size() - 1));
	}


	public static Vector prime_factors(double n) {
	    /*Returns all the prime factors of a positive integer*/
		Vector j = new Vector();
	    int d = 2;
	    while(n > 1){
	        while(n % d == 0) {
	            j.add(d);
	            n /= d;
	        }
	        d = d + 1;
	    }
	    return j;
	}	
}
