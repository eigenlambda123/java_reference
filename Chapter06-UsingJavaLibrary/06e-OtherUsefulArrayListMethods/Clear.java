import java.util.ArrayList;

class Clear {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		colors.add("Red");
		colors.add("Blue");

		System.out.println(colors.contains("Red"));   // true
		System.out.println(colors.contains("Green")); // false
	}
}

