public class VariableDemo {
    // Instance variable (has default value 0)
    private int instanceVar;

    public void showVariables() {
        // Local variable (must be initialized before use)
        int localVar;

        // Uncommenting the next line causes a compile-time error
        // System.out.println("Local variable: " + localVar); // Error: localVar might not have been initialized

        localVar = 5;  // initialize local variable

        System.out.println("Instance variable (default): " + instanceVar); // prints 0 by default
        System.out.println("Local variable (initialized): " + localVar);
    }

    public static void main(String[] args) {
        VariableDemo demo = new VariableDemo();
        demo.showVariables();
    }
}