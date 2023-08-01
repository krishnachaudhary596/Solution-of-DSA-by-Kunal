// 7. To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of terms: ");
       
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        
//         Using While loop
         int count = 2;

         while(count <= n){
             int temp = b;
             b = b + a;
             a = temp;
             count++;
         } System.out.println(b);
     }

    // Using for loop
//        for(int count=2; count<=n; count++){
//            int temp = b;
//            b = b + a;
//            a = temp;
//        }
//        System.out.println(b);
}

