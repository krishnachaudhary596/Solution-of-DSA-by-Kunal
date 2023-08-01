// 1. Area Of Circle Java Program

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius of circle: "); 
        
        int radius = in.nextInt();
        double pie = 3.14, area;
        area = pie * (radius * radius);

        System.out.println(area);
    }
}
