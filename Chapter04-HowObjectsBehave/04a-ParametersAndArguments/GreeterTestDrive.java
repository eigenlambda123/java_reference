class Greeter {
    // Method with parameters
    void greet(String name, int age) {
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }
}

class GreeterTestDrive {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        
        // Arguments passed to the method
        greeter.greet("Alice", 25);
        greeter.greet("Bob", 30);
    }
}
