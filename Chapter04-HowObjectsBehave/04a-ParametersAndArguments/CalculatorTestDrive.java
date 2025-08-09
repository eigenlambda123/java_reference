class Calculator {
    // Parameters: num1 and num2
    int add(int num1, int num2) {
        return num1 + num2;
    }
}

public class CalculatorTestDrive {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        // Arguments: 5 and 7
        int result = calc.add(5, 7);
        
        System.out.println("Sum: " + result);
    }
}
