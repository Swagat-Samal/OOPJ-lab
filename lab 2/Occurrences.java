import java.util.Scanner;

public class Occurrences {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        boolean[] visited = new boolean[n];

        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            visited[i] = false;
        }

        for (int i = 0; i < n; i++) {

            if (visited[i] == true)
                continue;

            int count = 1;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println("Occurrence of " + arr[i] + " = " + count);
        }
    }
}
