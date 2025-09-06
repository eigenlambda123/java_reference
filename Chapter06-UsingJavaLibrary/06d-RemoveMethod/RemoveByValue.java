import java.util.ArrayList;

public class RemoveByValue {
    public static void main(String[] args) {
	ArrayList<Integer> numbers = new ArrayList<>();
	numbers.add(10);
	numbers.add(20);
	numbers.add(30);

	boolean removed = numbers.remove(Integer.valueOf(20)); // removes first 20
	System.out.println("Removed 20? " + removed);
	System.out.println("Updated list: " + numbers);
    }
}