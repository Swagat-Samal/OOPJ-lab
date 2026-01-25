import java.util.Scanner;

class Box
{
    int length;
    int width;
    int height;

    int volume()
    {
        return length * width * height;
    }
}

class DemoBox
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Box b = new Box();

        System.out.print("Enter length: ");
        b.length = sc.nextInt();

        System.out.print("Enter width: ");
        b.width = sc.nextInt();

        System.out.print("Enter height: ");
        b.height = sc.nextInt();

        System.out.println("Volume = " + b.volume());
    }
}
