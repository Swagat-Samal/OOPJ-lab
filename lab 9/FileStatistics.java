package String;

import java.io.*;
import java.util.Scanner;

public class FileStatistics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the file name: ");
        String fileName = sc.nextLine();

        int characters = 0;
        int words = 0;
        int lines = 0;

        try {

            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = br.readLine()) != null) {

                lines++;

                characters += line.length();

                String[] wordArray = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    words += wordArray.length;
                }
            }

            br.close();

            System.out.println("\nNo. of characters - " + characters);
            System.out.println("No. of lines - " + lines);
            System.out.println("No. of words - " + words);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

