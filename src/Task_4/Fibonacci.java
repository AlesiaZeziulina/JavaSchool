package Task_4;

import java.util.Scanner;

class Fibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number: ");

        while (!input.hasNextInt()) {
            System.out.println("Not a number! Please input any positive number: ");
            input.next();
        }
        int el_number = input.nextInt();

        while (el_number <= 0) {
            System.out.print("Please input any positive number: ");
            el_number = input.nextInt();
        }

        int[] fibonacci_sequence = new int[el_number];
        fibonacci_sequence[0] = 0;
        fibonacci_sequence[1] = 1;
        for (int i = 2; i < el_number; ++i) {
            fibonacci_sequence[i] = fibonacci_sequence[i - 1] + fibonacci_sequence[i - 2];
        }

        for (int i = 0; i < el_number; ++i) {
            System.out.print(fibonacci_sequence[i] + " ");
        }
    }
}