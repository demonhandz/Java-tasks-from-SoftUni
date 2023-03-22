package IfElseStatementsExercise;

import java.util.Scanner;

public class Shopping07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int graphicsCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ramSticks = Integer.parseInt(scanner.nextLine());

        double graphicsCardsPrice = graphicsCards * 250;
        double processorsPrice = graphicsCardsPrice * 0.35 * processors;
        double ramSticksPrice = graphicsCardsPrice * 0.10 * ramSticks;


        double totalSum = graphicsCardsPrice + processorsPrice + ramSticksPrice;

        if (graphicsCards > processors) {
            totalSum = totalSum - (totalSum * 0.15);
        }


        if (totalSum <= budget) {
            System.out.printf("You have %.2f leva left!", budget - totalSum);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", totalSum - budget);
        }
    }
}
