import java.util.Scanner;

public class Palindrome{
  public static void main(String[] args) {
    Scanner in =  new Scanner(System.in);
    System.out.println("Enter a series of number");

    int num = in.nextInt();
    int ans = 0;
    int temp;
    temp = num;
    
    while(num > 0){
      int rem = num % 10;
      num = num / 10;
      ans = ans * 10 + rem;
    }

    if (temp == ans){
      System.out.println("Number is Palindrome");
    } 
    else{
      System.out.println("Number is not Palindrome");
    }
  }
}