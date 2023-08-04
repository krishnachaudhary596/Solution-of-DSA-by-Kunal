import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius and heigh of Volume of Cylinder:");

        float pie = 3.14f;
        int radius = in.nextInt();
        int height = in.nextInt();
        float volume = pie * radius * height;

        System.out.println("Volume of cylinder is: " + volume);
    }
}
