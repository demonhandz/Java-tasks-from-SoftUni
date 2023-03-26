package FinalExam;

import java.util.Scanner;

public class BeerAndChips_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double totalBudget = Double.parseDouble(scanner.nextLine());
        int bottlesOfBeer = Integer.parseInt(scanner.nextLine());
        int bagOfChips = Integer.parseInt(scanner.nextLine());

        double beerPrice = 1.20 * bottlesOfBeer;
        double priceForChips = beerPrice * 45 / 100;
        double totalChipsPrice = Math.ceil(priceForChips * bagOfChips);
        double totalPrice = beerPrice + totalChipsPrice;

        if (totalBudget >= totalPrice) {
            System.out.printf("%s bought a snack and has %.2f leva left.", name, totalBudget - totalPrice);
        } else {
            System.out.printf("%s needs %.2f more leva!", name, totalPrice - totalBudget);
        }
    }
}
