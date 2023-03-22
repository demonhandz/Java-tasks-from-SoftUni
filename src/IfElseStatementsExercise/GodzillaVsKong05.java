package IfElseStatementsExercise;

import java.util.Scanner;

public class GodzillaVsKong05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double movieBudget = Double.parseDouble(scanner.nextLine());
        double statistAmount = Double.parseDouble(scanner.nextLine());
        double priceStatist = Double.parseDouble(scanner.nextLine());

        double movieDecorPrice = movieBudget * 0.10;
        double priceForClothing = statistAmount * priceStatist;



        if (statistAmount > 150) {
            priceForClothing = priceForClothing - (priceForClothing * 0.1);
        }

        double totalMoviePrice = movieDecorPrice + priceForClothing;



        if (movieBudget < totalMoviePrice) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", totalMoviePrice - movieBudget);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", movieBudget - totalMoviePrice);
        }
    }
}
