class Subtract
{
    void subtract(int a, int b)
    {
        System.out.println("Result = " + (a - b));
    }

    void subtract(int a, int b, int c)
    {
        System.out.println("Result = " + (a - b - c));
    }

    void subtract(double a, double b)
    {
        System.out.println("Result = " + (a - b));
    }
}

class SubtractDemo
{
    public static void main(String[] args)
    {
        Subtract s = new Subtract();

        s.subtract(10, 5);
        s.subtract(20, 5, 3);
        s.subtract(10.5, 2.5);
    }
}
