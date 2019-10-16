package Task_3;

import java.util.Scanner;

class Numbers {

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

        int[] random_array = new int[el_number];


        for (int i = 0; i < el_number; i++) {
            int random_restriction = 100;
            int rand = (int) (Math.random() * random_restriction);
            random_array[i] = rand;
        }

        System.out.print("Even: ");
        for (int i=0; i < el_number; i++) {
            if ((random_array[i] % 2) == 0) {
                System.out.print(random_array[i] + " ");
            }
        }

        System.out.println();
        System.out.print("Odd: ");
        for (int i=0; i < el_number; i++) {
            if ((random_array[i] % 2) != 0) {
                System.out.print(random_array[i] + " ");
            }
        }

        System.out.println();
        System.out.print("Can be divided by 3: ");
        for (int i=0; i < el_number; i++) {
            if ((random_array[i] % 3) == 0) {
                System.out.print(random_array[i] + " ");
            }
        }

        System.out.println();
        System.out.print("Can be divided by 5: ");
        for (int i=0; i < el_number; i++) {
            if ((random_array[i] % 5) == 0) {
                System.out.print(random_array[i] + " ");
            }
        }
    }
}