// 2. Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class Print_Greeting_Message {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your name: ");

        String name = input.nextLine();
        System.out.println("You are most Welcome " + name);
    }
    
}
