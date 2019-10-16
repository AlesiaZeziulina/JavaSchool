package Task_5;

import java.util.Scanner;

class Strings {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any word/phrase: ");
        String phrase = input.nextLine();

        while (phrase.length() == 0) {
            System.out.println("Empty string. Enter any word/phrase: ");
            phrase = input.nextLine();
        }

        int el_number = phrase.length();
        String reversed = new StringBuffer(phrase).reverse().toString();

        if (reversed.equalsIgnoreCase(phrase)) {
            System.out.println("A palindrome!");
        }
        else System.out.println("Not a palindrome");

    }
}