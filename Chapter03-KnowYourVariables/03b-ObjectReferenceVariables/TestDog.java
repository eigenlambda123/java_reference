class Dog {
    String name;
}

public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog(); // d1 holds a reference to a Dog object
        d1.name = "Buddy";

        Dog d2 = d1; // d2 now also refers to the same Dog object
        System.out.println(d2.name); // prints "Buddy"
    }
}
