package Task_7;

import java.util.Scanner;

public class Calculator {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = getInt();
        char operation = getOperation();
        int num2 = getInt();

        int result = calc(num1,num2,operation);
        System.out.println(result);
    }

    private static int getInt() {
        Scanner input = new Scanner(System.in);
        while (!input.hasNextInt()) {
            System.out.println("Not a number! Please input any positive number: ");
            input.next();
        }
        int num = input.nextInt();
        return num;
    }

    private static char getOperation(){
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Incorrect inpuuiuiut. Please enter +, -, * or /:");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    private static int calc(int num1, int num2, char operation){
        int result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Incorrect input. Please enter +, -, * or /:");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }


}