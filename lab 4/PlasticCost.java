import java.util.Scanner;

class Plastic2D {
    double length, breadth;
    final double rate2D = 40;

    double calculate2DCost(double l, double b) {
        return l * b * rate2D;
    }
}

class Plastic3D extends Plastic2D {
    double height;
    final double rate3D = 60;

    double calculate3DCost(double l, double b, double h) {
        return l * b * h * rate3D;
    }
}

public class PlasticCost {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Plastic Type:");
        System.out.println("1. 2D Sheet");
        System.out.println("2. 3D Box");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter length and breadth: ");
            double l = sc.nextDouble();
            double b = sc.nextDouble();

            Plastic2D p2d = new Plastic2D();
            System.out.println("Cost of 2D Sheet: Rs. " + p2d.calculate2DCost(l, b));

        } else if (choice == 2) {
            System.out.print("Enter length, breadth and height: ");
            double l = sc.nextDouble();
            double b = sc.nextDouble();
            double h = sc.nextDouble();

            Plastic3D p3d = new Plastic3D();
            System.out.println("Cost of 3D Box: Rs. " + p3d.calculate3DCost(l, b, h));

        } else {
            System.out.println("Invalid Choice");
        }
    }
}
