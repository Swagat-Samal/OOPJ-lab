package String;

import java.util.Scanner;

public class StringOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str1 = sc.nextLine();

        String changedCase = "";
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (Character.isUpperCase(ch)) {
                changedCase = changedCase + Character.toLowerCase(ch);
            } else {
                changedCase = changedCase + Character.toUpperCase(ch);
            }
        }
        System.out.println("The string after changing the case is " + changedCase);

        String reversed = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            reversed = reversed + str1.charAt(i);
        }
        System.out.println("The string after reversing is " + reversed);

        System.out.print("\nEnter the second string for comparison: ");
        String str2 = sc.nextLine();

        int difference = Math.abs(str1.compareTo(str2));
        System.out.println("The difference between ASCII values is " + difference);

        System.out.print("\nEnter the string to be inserted into first string: ");
        String insertStr = sc.nextLine();

        String inserted = str1 + " " + insertStr;
        System.out.println("The string after insertion is: " + inserted);

        System.out.print("\nEnter a String: ");
        String str3 = sc.nextLine();

        System.out.println("Uppercase: " + str3.toUpperCase());
        System.out.println("Lowercase: " + str3.toLowerCase());

        System.out.print("\nEnter a String: ");
        String str4 = sc.nextLine();

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        int pos = str4.indexOf(ch);

        if (pos != -1) {
            System.out.println("Position of entered character: " + (pos + 1));
        } else {
            System.out.println("Entered character is not present");
        }

        sc.nextLine();

        System.out.print("\nEnter a String: ");
        String str5 = sc.nextLine();

        String rev = "";
        for (int i = str5.length() - 1; i >= 0; i--) {
            rev = rev + str5.charAt(i);
        }

        if (str5.equalsIgnoreCase(rev)) {
            System.out.println("Entered string is palindrome");
        } else {
            System.out.println("Entered string is not a palindrome");
        }

        System.out.print("\nEnter a String: ");
        String str6 = sc.nextLine();

        int words = str6.trim().split("\\s+").length;
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < str6.length(); i++) {
            char c = Character.toLowerCase(str6.charAt(i));

            if (Character.isLetter(c)) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("No. of words: " + words);
        System.out.println("No. of vowels: " + vowels);
        System.out.println("No. of consonants: " + consonants);

        sc.close();
    }
}

