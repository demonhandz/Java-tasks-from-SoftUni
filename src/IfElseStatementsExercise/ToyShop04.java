package IfElseStatementsExercise;

import java.util.Scanner;

public class ToyShop04 {
    public static void main(String[] args) {
        /*1. Цена на екскурзията - реално число в интервала [1.00 … 10000.00]
          2. Брой пъзели - цяло число в интервала [0… 1000]
          3. Брой говорещи кукли - цяло число в интервала [0 … 1000]
          4. Брой плюшени мечета - цяло число в интервала [0 … 1000]
          5. Брой миньони - цяло число в интервала [0 … 1000]
          6. Брой камиончета - цяло число в интервала [0 … 1000]*/
        Scanner scanner = new Scanner(System.in);

        double holidayPrice = Double.parseDouble(scanner.nextLine());

        int puzzles = Integer.parseInt(scanner.next());
        int dolls = Integer.parseInt(scanner.next());
        int teddyBears = Integer.parseInt(scanner.next());
        int minions = Integer.parseInt(scanner.next());
        int trucks = Integer.parseInt(scanner.next());

        double puzzlesPrice = puzzles * 2.60;
        double dollsPrice = dolls * 3;
        double teddyBearsPrice = teddyBears * 4.10;
        double minionsPrice = minions * 8.20;
        double trucksPrice = trucks * 2;

        double profit = puzzlesPrice + dollsPrice + teddyBearsPrice + minionsPrice + trucksPrice;
        int totalToys = puzzles + dolls + teddyBears + minions + trucks;

        if (totalToys >= 50) {
            profit = profit - (profit * 0.25);
        }

        double totalProfit = profit - (profit * 0.10);

        if (totalProfit >= holidayPrice) {
            System.out.printf("Yes! %.2f lv left.", totalProfit - holidayPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", holidayPrice - totalProfit);
        }
    }
}