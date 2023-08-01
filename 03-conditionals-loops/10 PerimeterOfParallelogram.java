import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter side of parallelogram:");
        int a = in.nextInt();
        System.out.println("Enter base of parallelogram:");
        int b = in.nextInt();

        int ans = 2 * (a + b);
        System.out.println("Your perimeter of parallelogram is:"+ ans);
    }
}
