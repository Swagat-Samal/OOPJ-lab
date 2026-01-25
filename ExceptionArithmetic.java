public class ExceptionArithmetic {

    public static void main(String[] args) {

        int a = 20;
        int b = 0;

        try {
            int c = a / b;
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught by try-catch-finally block");
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
