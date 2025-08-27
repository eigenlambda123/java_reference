import java.util.ArrayList;

public class EnhancedForLoopCollection {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}