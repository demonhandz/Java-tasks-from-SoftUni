package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class InchToCm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = 2.54;
        double area = a * b;
        System.out.println(area);
    }
}
