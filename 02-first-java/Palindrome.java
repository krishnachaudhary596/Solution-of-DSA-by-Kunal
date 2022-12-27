// 8. To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class Palindrome{
  public static void main(String[] args) {

    // Taking User input
    Scanner in =  new Scanner(System.in);
    System.out.println("Enter a series of number");

    // Making variable
    int num = in.nextInt();
    int ans = 0;
    int temp;
    temp = num;
    // char op = in.next().trim().charAt(0);
   
    // Doing Calculations
    while(num > 0){
      int rem = num % 10;
      num = num / 10;
      ans = ans * 10 + rem;
    }
      // Printing Output
      if (temp == ans){
        System.out.println("Number is Palindrome");
      } 
      else{
        System.out.println("Number is not Palindrome");
      }
  }
}