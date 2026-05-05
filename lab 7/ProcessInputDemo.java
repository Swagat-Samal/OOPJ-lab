import java.util.Scanner;

class NegativeNumberException extends Exception {

    public NegativeNumberException(String message) {
        super(message);
    }
}

public class ProcessInputDemo {

    void ProcessInput(int num) throws NegativeNumberException {

        if (num < 0) {
            throw new NegativeNumberException("number should be positive");
        } else {
            System.out.println("Double value:" + (num * 2));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        ProcessInputDemo obj = new ProcessInputDemo();

        try {
            obj.ProcessInput(n);
        } catch (NegativeNumberException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e);
        }
    }
}
