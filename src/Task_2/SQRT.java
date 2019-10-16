package Task_2;

import java.util.Scanner;

class SQRT {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number A: ");
        double a = in.nextDouble();
        System.out.print("Input a number B: ");
        double b = in.nextDouble();
        System.out.print("Input a number C: ");
        double c = in.nextDouble();
        new_sqrt(a, b, c);
    }

    private static void new_sqrt(double a, double b, double c) {
        double D = (b * b) - 4 * a * c;

        if (D == 0) {
            System.out.print("Oops... No square roots :(");
        }
        else if (D > 0) {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Square root 1: " + x1);
            System.out.println("Square root 2: " + x2);
        }
        else{
            double x3 = (-b) / (2 * a);
            System.out.print("Square root: " + x3);
        }
    }
}