import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Base and Height of Prism: ");

        int base = in.nextInt();
        int height = in.nextInt();
        int volume = base * height;
        System.out.println("Volume of Prism is: " + volume);
    }
}
