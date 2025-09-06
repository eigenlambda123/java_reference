import java.util.ArrayList;

public class SetMethod {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("Before set: " + fruits);

        // Replace "Banana" with "Mango"
        fruits.set(1, "Mango");

        System.out.println("After set: " + fruits);
    }
}