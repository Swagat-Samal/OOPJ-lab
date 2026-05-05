import java.util.Scanner;

interface Salary {
    double earnings();
    double deductions();
    double bonus();
}

abstract class Manager implements Salary {
    double basic;

    Manager(double b) {
        basic = b;
    }

    public double earnings() {
        double da = 0.80 * basic;
        double hra = 0.15 * basic;
        return basic + da + hra;
    }

    public double deductions() {
        return 0.12 * basic;
    }
}

class Substaff extends Manager {

    Substaff(double b) {
        super(b);
    }

    public double bonus() {
        return 0.50 * basic;
    }
}

public class SalaryDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        Substaff s = new Substaff(basic);

        System.out.println("Earnings - " + s.earnings());
        System.out.println("Deduction - " + s.deductions());
        System.out.println("Bonus - " + s.bonus());
    }
}
