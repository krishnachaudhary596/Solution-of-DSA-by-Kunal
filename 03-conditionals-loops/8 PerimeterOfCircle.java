import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        int radius = in.nextInt();
        float pie = 3.14f;

        float ans = 2 * pie * radius;
        System.out.println("Perimeter of circle is: " + ans);
    }
}
