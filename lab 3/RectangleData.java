import java.util.Scanner;

class RectangleData
{
    int length;
    int breadth;

    RectangleData()
    {
        length = 0;
        breadth = 0;
    }

    RectangleData(int l, int b)
    {
        length = l;
        breadth = b;
    }

    int area()
    {
        return length * breadth;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        RectangleData r1 = new RectangleData();
        System.out.println("Area using default constructor = " + r1.area());

        System.out.print("Enter length: ");
        int l = sc.nextInt();
        System.out.print("Enter breadth: ");
        int b = sc.nextInt();

        RectangleData r2 = new RectangleData(l, b);
        System.out.println("Area using parameterized constructor = " + r2.area());
    }
}
