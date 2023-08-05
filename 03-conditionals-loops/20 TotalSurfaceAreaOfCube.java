import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Total Surface Area Of Cube:");

        System.out.println("Enter side length of the cube:");
        float a = in.nextFloat();

        float area = 6 * a * a;
        System.out.println("Total Surface Area Of Cube: " + area);
    }
}
