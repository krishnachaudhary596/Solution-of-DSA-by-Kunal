import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter side of Equilateral Triangle: ");
        int a = in.nextInt();

        int ans = 3 * a;
        System.out.println("Your perimeter of equilateral triangle is: " + ans);
    }
}
