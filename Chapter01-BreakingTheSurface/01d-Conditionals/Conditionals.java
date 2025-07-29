public class Conditionals {
	public static void main (String[] args) {

		int x = 10;
		String name = "Dirk";

		// conditionals
		if (x == 10) {
			System.out.print("x must be 10");
		} else {
			System.out.print("x isn't 10");
		}

		if ((x > 3) & (name.equals("Dirk"))) {
			System.out.print("Gently");
		}
		System.out.print("This line runs no matter what");
	}
}