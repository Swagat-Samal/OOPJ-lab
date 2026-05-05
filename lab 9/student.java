package String;

import java.io.*;
import java.util.Scanner;

public class student {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Enter Student Details");

            System.out.print("Roll No: ");
            int rollNo = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Subject: ");
            String subject = sc.nextLine();

            System.out.print("Marks: ");
            int marks = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter existing file name: ");
            String fileName = sc.nextLine();

            FileWriter fw = new FileWriter(fileName, true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Roll No: " + rollNo + ", Name: " + name +
                    ", Subject: " + subject + ", Marks: " + marks);
            bw.newLine();

            bw.close();
            fw.close();

            System.out.println("\nData written successfully.\n");

            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            String line;
            System.out.println("File Contents:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            fr.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
