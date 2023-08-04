import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter base length:");
        int l = in.nextInt();

        System.out.println("Enter base width:");
        int w = in.nextInt();

        System.out.println("Enter pyramid height:");
        int h = in.nextInt();

        int volume = (l * w * h)/3;
        System.out.println("Volume of pyramid:" + volume);
    }
}
