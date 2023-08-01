import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length & height: ");
        float l = in.nextInt();
        float h = in.nextInt();

        float area = l*h;

        System.out.println("Area of Rectangle is: " + area);
    }
}
