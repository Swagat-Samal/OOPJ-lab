class CheckArgument extends Exception {
    public CheckArgument() {
        super("CheckArgument");
    }
}

public class CheckArgumentDemo {

    public static void main(String[] args) {

        try {
            if (args.length < 4) {
                throw new CheckArgument();
            }

            int sum = 0;

            for (int i = 0; i < 4; i++) {
                int n = Integer.parseInt(args[i]);
                sum = sum + (n * n);
            }

            System.out.println(sum);

        } catch (CheckArgument e) {
            System.out.println("Exception occurred - " + e.getMessage());
        }
    }
}