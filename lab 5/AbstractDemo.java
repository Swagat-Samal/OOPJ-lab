import java.util.Scanner;

abstract class Student {
    int rollno;
    long regno;

    void getinput(int r, long rg) {
        rollno = r;
        regno = rg;
    }

    abstract void course();
}

class Kiitian extends Student {
    void course() {
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }

    void display() {
        System.out.println("Rollno - " + rollno);
        System.out.println("Registration no - " + regno);
        course();
    }
}

public class AbstractDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rollno: ");
        int r = sc.nextInt();

        System.out.print("Enter Registration no: ");
        long rg = sc.nextLong();

        Kiitian k = new Kiitian();
        k.getinput(r, rg);
        k.display();
    }
}
