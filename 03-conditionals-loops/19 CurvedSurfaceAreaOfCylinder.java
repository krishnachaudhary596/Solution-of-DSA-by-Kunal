import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Curved Surface Area Of Cylinder:");

        System.out.println("Enter radius:");
        float radius = in.nextFloat();
        System.out.println("Enter height:");
        float height = in.nextFloat();

        float pie = 3.14f;
        float area = 1 * pie * radius * height;

        System.out.println("Curved Surface Area Of Cylinder:" + area);
    }
}
