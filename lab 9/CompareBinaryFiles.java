package String;

import java.io.*;
import java.util.Scanner;

public class CompareBinaryFiles {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String baseDir = "C:\\Users\\KIIT\\IdeaProjects\\OOPJ_Lab\\";
        System.out.print("Enter first file path: ");
        String file1 = sc.nextLine();
        System.out.print("Enter second file path: ");
        String file2 = sc.nextLine();
        if (!file1.contains(":\\") && !file1.startsWith("\\\\")) {
            file1 = baseDir + file1;
        }
        if (!file2.contains(":\\") && !file2.startsWith("\\\\")) {
            file2 = baseDir + file2;
        }

        try {

            FileInputStream fis1 = new FileInputStream(file1);
            FileInputStream fis2 = new FileInputStream(file2);

            int b1, b2;
            int position = 0;
            boolean areEqual = true;

            while (true) {

                b1 = fis1.read();
                b2 = fis2.read();

                if (b1 == -1 && b2 == -1) {
                    break;
                }

                position++;

                if (b1 != b2) {
                    areEqual = false;
                    System.out.println("Two files are not equal: byte position at which two files differ is " + position);
                    break;
                }
            }

            if (areEqual) {
                System.out.println("Two files are equal");
            }

            fis1.close();
            fis2.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
