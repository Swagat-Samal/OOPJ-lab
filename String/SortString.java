package String;

import java.util.Scanner;
import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char[] arr = str.toCharArray();

        Arrays.sort(arr);

        String sorted = new String(arr);

        System.out.println("Sorted String: " + sorted);

        sc.close();
    }
}
