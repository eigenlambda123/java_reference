class CastingForLoops {
    public static void main(String[] args) {
        System.out.println("Casting inside for loop:");

        for (int i = 0; i < 5; i++) {
            // Widening: int → double
            double d = i;  
            
            // Narrowing: double → int
            int narrowed = (int) (d * 1.5);

            System.out.println("i = " + i + 
                               " | widened (int→double) = " + d + 
                               " | narrowed (double→int) = " + narrowed);
        }
    }
}
