package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class ExtraTask1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        float a;
        float b;
        float h;
        float area;

        System.out.println("Enter a: ");
        a = scanner.nextFloat();

        System.out.println("Enter b: ");
        b = scanner.nextFloat();

        System.out.println("Enter h: ");
        h = scanner.nextFloat();

        area = (a +b) * h / 2;
        System.out.println("Area: " + area);
    }
}
