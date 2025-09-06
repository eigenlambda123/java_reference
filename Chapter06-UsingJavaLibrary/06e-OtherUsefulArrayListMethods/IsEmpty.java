import java.util.ArrayList;

class IsEmpty{
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();

		System.out.println(numbers.isEmpty()); // true
		numbers.add(5);
		System.out.println(numbers.isEmpty()); // false
	}
}