import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Side length of the " +
                "equilateral triangle (or 'x' to quit): ");
        char op = in.next().trim().charAt(0);
        float area;
        while (true) {
            if (op == 'x'){
                break;
            } else {
//            Taking inputs
                int a = in.nextInt();

                area = (float) ((1.73 * a * a) / 4);
                System.out.println(area);
            }

        }

    }
}
