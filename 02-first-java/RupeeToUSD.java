// 6. Input currency in rupees and output in USD.

import java.util.Scanner;

public class RupeeToUSD {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        System.out.println("Enter your number: ");
        float num1 = input.nextInt();

        num1 = num1 * (82.74f);

        System.out.println(num1 + " USD");
    }
}
