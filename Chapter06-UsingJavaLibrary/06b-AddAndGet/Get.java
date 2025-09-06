import java.util.ArrayList;

class Get {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Elephant");

        // Get elements by index
        System.out.println("First element: " + animals.get(0));
        System.out.println("Second element: " + animals.get(1));
    }
}