public class Loops {
	public static void main (String[] args) {
		// declare x before using it
		int x = 15; 
		
		// while loop
		while (x > 12) {
			x = x - 1;
			System.out.print("While loop x is now " + x);
		}

		// for loop
		for (int y = 0; y < 10; y = y + 1) {
			System.out.print("For loop x is now " + y);
		}

	}
}