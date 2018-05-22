package Problem11;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * 
 * @author Jacob Sherrill
 * @date 19 July 2014
 * I felt decent about this one, a lot of boilerplate I guess.
 * I completed this with the new mechanical keyboard on the netbook which
 * was fun
 * It's fun over here
 *
 */

/*
In the 20×20 grid below, four numbers along a diagonal line have been marked 
in red.

The product of these numbers is 26 × 63 × 78 × 14 = 1788696.

What is the greatest product of four adjacent numbers in the same direction 
(up, down, left, right, or diagonally) in the 20×20 grid?
*/
/*
 * 1. Create a vector with the data in it
 * 2. Loop through verticals
 * 3. Loop through horizontals 
 * 4. Loop through NW to SE diags
 * 5. Loop through SW to NE diags
 * 6. return the maximum product
 */
public class problem {
	public static int [][] grid = new int [20][20];
	private static int maximumProduct = 0;
	public static void main(String [] args) {
		fillData();
		checkGrid();
		System.out.println(maximumProduct);
	}

	private static void checkGrid() {
		checkVerticalProducts();
		checkHorizontalProducts();
		checkDiagonalNWProducts();
		checkDiagonalSWProducts();
	}

	private static void checkDiagonalSWProducts() {
		// TODO Auto-generated method stub
		System.out.println("Checking diagonal SW to NE products");
		for(int y = 0; y + 3 < grid.length; y++) {
			for(int x = 0; x + 3 < grid.length; x++) {
				if(grid[x+0][y+3] * grid[x+1][y+2] 
					* grid[x+2][y+1] * grid[x+3][y+0] 
					> maximumProduct) 
				{
					maximumProduct =
					grid[x+0][y+3]
					* grid[x+1][y+2] 
					* grid[x+2][y+1]
					* grid[x+3][y+0];
					System.out.println(grid[x+0][y+3]
					 + " " + grid[x+1][y+2] 
					 + " " + grid[x+2][y+1]
					 + " " + grid[x+3][y+0]);
				}
			}
		}
		
	}

	private static void checkDiagonalNWProducts() {
		System.out.println("Checking diagonal NW to SE products");
		for(int y = 0; y + 3 < grid.length; y++) {
			for(int x = 0; x + 3 < grid.length; x++) {
				if(grid[x+0][y+0]
					* grid[x+1][y+1] 
					* grid[x+2][y+2]
					* grid[x+3][y+3]
					> maximumProduct)
				{
					maximumProduct = 
					grid[x+0][y+0]
					* grid[x+1][y+1] 
					* grid[x+2][y+2]
					* grid[x+3][y+3];
				}
			}
		}
		
	}

	private static void checkHorizontalProducts() {
		System.out.println("Checking horizontal products");
		for(int y = 0; y < grid.length; y++) {
			for(int x = 0; x + 3 < grid.length; x++) {
				if(grid[x+0][y]
					* grid[x+1][y]
					* grid[x+2][y]
					* grid[x+3][y]
					> maximumProduct)
				{
					maximumProduct =
						grid[x+0][y]
						* grid[x+1][y]
						* grid[x+2][y]
						* grid[x+3][y];
				}
			}
		}
		
		
	}

	private static void checkVerticalProducts() {
		System.out.println("Checking vertical products");
		for(int y = 0; y + 3 < grid.length; y++) {
			for(int x = 0; x < grid.length; x++) {
				if(grid[x][y+0]
					* grid[x][y+1] 
					* grid[x][y+2]
					* grid[x][y+3]
					> maximumProduct)
				{
					maximumProduct =
						grid[x][y+0]
						* grid[x][y+1] 
						* grid[x][y+2]
						* grid[x][y+3];
				}
			}
		}
	}

	private static void fillData() {
		try {
			File file = new File("problem11.dat");
			Scanner tokens = new Scanner(file);
			int lines = 0;
			for(int y = 0; y < grid.length; y++) {
				for(int x = 0; x < grid.length; x++) {
					grid[x][y] = tokens.nextInt();
				}
				tokens.nextLine();
				lines++;
				System.out.println("Number of lines: " + lines);
			}	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
