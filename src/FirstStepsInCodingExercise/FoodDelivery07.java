package FirstStepsInCodingExercise;

import java.util.Scanner;

public class FoodDelivery07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenus = Integer.parseInt(scanner.nextLine());
        int fishMenus = Integer.parseInt(scanner.nextLine());
        int veggieMenus = Integer.parseInt(scanner.nextLine());

        double priceChicken = chickenMenus * 10.35;
        double priceFish = fishMenus * 12.40;
        double priceVeggie = veggieMenus * 8.15;
        int percent = 20;

        double totalPrice = priceChicken + priceFish + priceVeggie;
        double desertPrice = totalPrice * 0.20;
        double finalPrice = totalPrice + desertPrice + 2.50;

        System.out.println(finalPrice);
    }
}
