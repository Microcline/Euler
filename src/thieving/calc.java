package thieving;

class calc {
	public static void main(String[] args) {
		double constant = 0.346938;
		for(int lvl = 38; lvl < 100; lvl++) {
			System.out.println(lvl + " " + (constant + (0.0060024 * lvl)));
		}	
	}	
}