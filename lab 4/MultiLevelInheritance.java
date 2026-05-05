import java.util.Scanner;

class Plate {
    double length, width;

    Plate(double l, double w) {
        length = l;
        width = w;
        System.out.println("Plate Dimensions:");
        System.out.println("Length = " + length + ", Width = " + width);
    }
}

class Box extends Plate {
    double height;

    Box(double l, double w, double h) {
        super(l, w);
        height = h;
        System.out.println("Box Dimensions:");
        System.out.println("Length = " + length + ", Width = " + width + ", Height = " + height);
    }
}

class WoodBox extends Box {
    double thick;

    WoodBox(double l, double w, double h, double t) {
        super(l, w, h);
        thick = t;
        System.out.println("WoodBox Dimensions:");
        System.out.println("Length = " + length + ", Width = " + width +
                           ", Height = " + height + ", Thickness = " + thick);
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length and width: ");
        double l = sc.nextDouble();
        double w = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        System.out.print("Enter thickness: ");
        double t = sc.nextDouble();
        new WoodBox(l, w, h, t);
    }
}
