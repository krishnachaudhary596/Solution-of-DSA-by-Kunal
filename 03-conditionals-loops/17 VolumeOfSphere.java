import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius:");

        float r = in.nextFloat();
        float volume = ((float) 4 /3) * 3.14f * (r * r * r);

        System.out.println("Volume of sphere is:" + volume);
    }
}
