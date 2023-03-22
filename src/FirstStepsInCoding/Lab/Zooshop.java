package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class Zooshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double cats = a * 2.50;
        double dogs = b * 4;

        double total = cats + dogs;

        System.out.printf("%.2f lv.", total);
    }
}
