class Calculator {
    // Return type: int
    int square(int number) {
        return number * number; // return statement
    }

    // Return type: void (no value returned)
    void printMessage() {
        System.out.println("Calculation complete!");
    }
}

public class CalculatorTestDrive {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        // Using the return value
        int result = calc.square(5);
        System.out.println("Square: " + result);
        
        // Calling a void method (no return value)
        calc.printMessage();
    }
}
