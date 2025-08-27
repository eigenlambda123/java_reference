class WideningNarrowing {
    public static void main(String[] args) {
        // Widening (automatic type conversion)
        byte b = 42;
        int i = b;        // byte → int
        double d = i;     // int → double

        System.out.println("Widening:");
        System.out.println("byte b = " + b);
        System.out.println("int i = " + i);
        System.out.println("double d = " + d);

        System.out.println();

        // Narrowing (explicit casting required)
        double x = 9.99;
        int y = (int) x;   // double → int (fraction lost)
        char c = (char) 97; // int → char ('a')

        System.out.println("Narrowing:");
        System.out.println("double x = " + x);
        System.out.println("int y = " + y + " (fraction lost)");
        System.out.println("char c = " + c + " (from int 97)");
    }
}

