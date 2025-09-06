import java.util.ArrayList;

public class RemoveByIndex {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println("Before remove: " + colors);

        colors.remove(1); // removes "Green" at index 1

        System.out.println("After remove: " + colors);
    }
}