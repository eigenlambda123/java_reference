import java.util.ArrayList;

class Add {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        // Adding elements at the end
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        System.out.println("Colors: " + colors);

        // Adding element at index 1
        colors.add(1, "Yellow");
        System.out.println("After insert: " + colors);
    }
}