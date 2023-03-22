package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double area = Double.parseDouble(scanner.nextLine());

        double result = area * 7.61;
        double discount = result * 0.18;

        double total = result - discount;

        System.out.printf("The final price is: %.2f lv.\n", total);
        System.out.printf("The discount is: %.2f lv.", discount);
    }
}
