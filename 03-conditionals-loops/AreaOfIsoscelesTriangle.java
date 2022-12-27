import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter breadth and height: ");
        float b = in.nextInt();
        float h = in.nextInt();
        float area;

        area = (1 * b * h)/2;
        System.out.println("Your area for Isosceles Triangle is: " + area);
    }
}
