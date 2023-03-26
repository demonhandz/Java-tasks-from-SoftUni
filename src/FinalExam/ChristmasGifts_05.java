package FinalExam;

import java.util.Scanner;

public class ChristmasGifts_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numAdults = 0;
        int numKids = 0;
        int moneyForToys = 0;
        int moneyForSweaters = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Christmas")) {
                break;
            }
            int age = Integer.parseInt(input);
            if (age <= 16) {
                numKids++;
                moneyForToys += 5;
            } else {
                numAdults++;
                moneyForSweaters += 15;
            }
        }

        System.out.println("Number of adults: " + numAdults);
        System.out.println("Number of kids: " + numKids);
        System.out.println("Money for toys: " + moneyForToys);
        System.out.println("Money for sweaters: " + moneyForSweaters);

    }
}
