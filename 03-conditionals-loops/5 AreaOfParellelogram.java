import java.util.Scanner;

public class AreaOfParellelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter base: ");
        int base = in.nextInt();
        System.out.println("Enter height: ");
        int height = in.nextInt();

        int area = base * height;

        System.out.println("Area of Parellelogram: " + area);
    }
}
