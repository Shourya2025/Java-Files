package Learning;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        float h;
        float b;
        float Area;

        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter the height of the triangle: ");
            h = s.nextFloat();
            System.out.print("Enter the base of the triangle: ");
            b = s.nextFloat();
        }

        Area = (b * h) / 2;
        System.out.println("Area of the triangle: " + Area);
    }
}