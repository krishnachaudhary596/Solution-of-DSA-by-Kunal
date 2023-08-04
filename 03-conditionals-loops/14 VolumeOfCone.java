import java.util.Arrays;
import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Volume of Cone");

        System.out.println("Enter Radius:");
        float r = in.nextFloat();

        System.out.println("Enter Height:");
        float h = in.nextFloat();

        float pie = 3.14f;
        float volume = ((pie * r * r * h)/3);

        System.out.println("Volume of Cone: " + volume);
    }
}
