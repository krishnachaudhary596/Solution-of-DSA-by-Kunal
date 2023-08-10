import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");

        int a = 0;
        int b = 1;
        int count = 2;
        int temp;
        int n = in.nextInt();
        System.out.println(a);
        System.out.println(b);

//        while loop
//        while (count <= n) {
//            temp = b;
//            b = a + b;
//            a = temp;
//            count++;
//
//            System.out.println(b);
//        }
//
//        for loop
        for (count = 2; count <= n; count++) {
            temp = b;
            b = a + b;
            a = temp;

            System.out.println(b);
        }
    }
}
