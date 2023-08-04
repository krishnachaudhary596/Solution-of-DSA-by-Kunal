import java.util.Scanner;

public class PerimeterOfRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Perimeter Of Rhombus");

        System.out.println("Enter Side of Rhombus:");
        int a = in.nextInt();

        int area = 4 * a;
        System.out.println("Perimeter Of Rhombus: " + area);

    }
}
