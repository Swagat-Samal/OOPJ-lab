import java.util.Scanner;


class HrsException extends Exception {
    public HrsException(String msg) {
        super(msg);
    }
}


class MinException extends Exception {
    public MinException(String msg) {
        super(msg);
    }
}


class SecException extends Exception {
    public SecException(String msg) {
        super(msg);
    }
}


class TimeDemo {
    int hours, minutes, seconds;


    void getTime() throws HrsException, MinException, SecException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hours: ");
        hours = sc.nextInt();
        if (hours < 0 || hours > 24) {
            throw new HrsException("hour is not greater than 24");
        }

        System.out.print("Enter minutes: ");
        minutes = sc.nextInt();
        if (minutes < 0 || minutes > 60) {
            throw new MinException("minute is not greater than 60");
        }

        System.out.print("Enter seconds: ");
        seconds = sc.nextInt();
        if (seconds < 0 || seconds > 60) {
            throw new SecException("second is not greater than 60");
        }

        System.out.println("Correct Time-> " + hours + ":" + minutes + ":" + seconds);
    }


    public static void main(String[] args) {
        TimeDemo t = new TimeDemo();

        try {
            t.getTime();
        } catch (HrsException | MinException | SecException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e);
        }
    }
}