class Dog {
    String name;

    Dog(String name) {
        this.name = name;
    }

    void bark() {
        System.out.println(name + " says: Woof!");
    }
}

public class GarbageCollectionDemo {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Fido");
        Dog dog2 = new Dog("Buddy");

        dog1.bark(); // Fido says: Woof!
        dog2.bark(); // Buddy says: Woof!

        // Make dog1 reference the same object as dog2
        dog1 = dog2;

        // Now, the original "Fido" object has no reference and is eligible for GC
        System.out.println("dog1 is now pointing to: " + dog1.name);
        System.out.println("dog2 is still pointing to: " + dog2.name);
    }
}
