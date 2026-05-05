package String;

import java.io.*;
import java.util.Scanner;

public class filecopy {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the source file name: ");
        String sourceFile = sc.nextLine();

        System.out.print("Enter the destination file name: ");
        String destinationFile = sc.nextLine();

        System.out.println("\nChoose Copy Method:");
        System.out.println("1. Character Stream");
        System.out.println("2. Byte Stream");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = sc.nextInt();

        try {
            if (choice == 1) {

                FileReader fr = new FileReader(sourceFile);
                FileWriter fw = new FileWriter(destinationFile);

                int ch;
                while ((ch = fr.read()) != -1) {
                    fw.write(ch);
                }

                fr.close();
                fw.close();

                System.out.println("\nFile Copied using Character Stream.");

            } else if (choice == 2) {

                FileInputStream fis = new FileInputStream(sourceFile);
                FileOutputStream fos = new FileOutputStream(destinationFile);

                int b;
                while ((b = fis.read()) != -1) {
                    fos.write(b);
                }

                fis.close();
                fos.close();

                System.out.println("\nFile Copied using Byte Stream.");

            } else {
                System.out.println("Invalid Choice.");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

