import java.util.Scanner;

public class DiagonalMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[3][3];

        System.out.println("Enter 3x3 Matrix:");

            for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < 3; i++) {
            leftSum += a[i][i];            
            rightSum += a[i][3 - 1 - i]; 
        }

        System.out.println("Left = " + leftSum);
        System.out.println("Right = " + rightSum);

        sc.close();
    }
}
