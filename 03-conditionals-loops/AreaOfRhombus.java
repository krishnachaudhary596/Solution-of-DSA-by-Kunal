import java.util.Arrays;
import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Diagonal 1: ");
        int d1 = in.nextInt();
        System.out.print("Enter Diagonal 2: ");
        int d2 = in.nextInt();

        int area = (d1 * d2)/2;

        System.out.println("Area Of Rhombus is: " + area);
    }
}
