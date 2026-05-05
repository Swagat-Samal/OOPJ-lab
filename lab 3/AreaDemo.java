import java.util.Scanner;

class Area
{
    void area(double r)
    {
        System.out.println("Area of Circle = " + (3.14 * r * r));
    }

    void area(double b, double h)
    {
        System.out.println("Area of Triangle = " + (0.5 * b * h));
    }

    void area(int s)
    {
        System.out.println("Area of Square = " + (s * s));
    }
}

class AreaDemo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Area a = new Area();

        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Square");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if(choice == 1)
        {
            System.out.print("Enter radius: ");
            double r = sc.nextDouble();
            a.area(r);
        }
        else if(choice == 2)
        {
            System.out.print("Enter base: ");
            double b = sc.nextDouble();
            System.out.print("Enter height: ");
            double h = sc.nextDouble();
            a.area(b, h);
        }
        else if(choice == 3)
        {
            System.out.print("Enter side: ");
            int s = sc.nextInt();
            a.area(s);
        }
        else
        {
            System.out.println("Invalid choice");
        }
    }
}
