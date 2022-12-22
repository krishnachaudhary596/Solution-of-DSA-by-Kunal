// 4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Simple_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, result;
        String operator;

        // Get user input
        System.out.println("Enter first number: ");
        num1 = input.nextInt();
        System.out.println("Enter first number: ");
        num2 = input.nextInt();
        System.out.println("Enter operator(+, -, *, /): ");
        operator = input.next();

        // Use if conditions to perform the correct operation

        if (operator.equals("+")){
            result = num1 + num2;
            System.out.println(result);
        }
        else if (operator.equals("-")){
            result = num1 - num2;
            System.out.println(result);
        }
        else if (operator.equals("*")){
            result = num1 * num2;
            System.out.println(result);
        }
        else if (operator.equals("/")){
            result = num1 / num2;
            System.out.println(result);
        }
        else{
            System.out.println("Invalid operator");
        }
    }
}
