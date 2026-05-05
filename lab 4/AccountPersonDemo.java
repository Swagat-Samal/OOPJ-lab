import java.util.Scanner;

class Account {
    int acc_no;
    double balance;

    void input(Scanner sc) {
        System.out.print("Enter Account Number: ");
        acc_no = sc.nextInt();

        System.out.print("Enter Balance: ");
        balance = sc.nextDouble();
    }

    void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    String name;
    long aadhar_no;

    void input(Scanner sc) {
        System.out.print("Enter Name: ");
        sc.nextLine(); // clear buffer
        name = sc.nextLine();

        System.out.print("Enter Aadhar Number: ");
        aadhar_no = sc.nextLong();

        super.input(sc); // call base class input
    }

    void disp() {
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
        super.disp(); // call base class display
    }
}

public class AccountPersonDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Person[] p = new Person[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details of Person " + (i + 1));
            p[i] = new Person();
            p[i].input(sc);
        }

        System.out.println("\nDisplaying Details of Three Persons:");
        for (int i = 0; i < 3; i++) {
            System.out.println("\nPerson " + (i + 1));
            p[i].disp();
        }
    }
}
