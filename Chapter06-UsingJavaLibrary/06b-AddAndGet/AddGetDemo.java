import java.util.ArrayList;

class AddGetDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding values
        for (int i = 1; i <= 5; i++) {
            numbers.add(i * 10); // adds 10,20,30,40,50
        }

        // Getting values
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Element at index " + i + " = " + numbers.get(i));
        }
    }
}