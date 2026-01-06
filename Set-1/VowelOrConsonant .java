/* 1.3 Write a Java program that prompts the user to enter a single letter (character). 
Determine whether the entered character is a vowel (a, e, i, o, u, case-insensitive) or a consonant, and display the result. */


import java.util.Scanner;

public class VowelOrConsonant  {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Prompt user
        System.out.print("Enter a single letter: ");
        char ch = scan.next().charAt(0);

        // Convert to lowercase for easy comparison
        ch = Character.toLowerCase(ch);

        // Check if character is an alphabet
        if (ch >= 'a' && ch <= 'z') {

            // Check for vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || 
                ch == 'o' || ch == 'u') {
                System.out.println("The entered character is a Vowel.");
            } else {
                System.out.println("The entered character is a Consonant.");
            }

        } else {
            System.out.println("Please enter a valid alphabet character.");
        }

        scan.close();
    }
}