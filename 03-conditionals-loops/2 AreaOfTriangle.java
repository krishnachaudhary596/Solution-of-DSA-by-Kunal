// 2. Area Of Triangle
import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter breadth & height: ");
        float b = in.nextInt();
        float h = in.nextInt();

        float area = (b*h)/2;

        System.out.println("Area of triangle is: " + area);
    }
}
