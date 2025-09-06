import java.util.ArrayList;

class ArrayListOverview {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("Fruits: " + fruits);

        System.out.println("First fruit: " + fruits.get(0));

        fruits.set(1, "Orange");
        System.out.println("Updated fruits: " + fruits);

        fruits.remove("Mango");
        System.out.println("After removal: " + fruits);

        System.out.println("Contains Apple? " + fruits.contains("Apple"));
        System.out.println("Size: " + fruits.size());
    }
}