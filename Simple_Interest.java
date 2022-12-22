// 3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter principal: ");
        int principal = input.nextInt();
        System.out.println("Enter Time: ");
        int time = input.nextInt();
        System.out.println("Enter Rate: ");
        int rate = input.nextInt();
        
        int simple_interest;

        simple_interest = principal * rate * time;

        System.out.println("Your Simple Interest is: " + simple_interest);
    }
}