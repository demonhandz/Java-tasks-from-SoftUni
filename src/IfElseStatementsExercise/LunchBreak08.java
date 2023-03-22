package IfElseStatementsExercise;

import java.util.Scanner;

public class LunchBreak08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int tvShowTime = Integer.parseInt(scanner.nextLine());
        int totalBreakTime = Integer.parseInt(scanner.nextLine());

        double timeForLunch = totalBreakTime / 8.0;
        double timeForRelax = totalBreakTime / 4.0;
        double totalRemainingTime = totalBreakTime - timeForRelax - timeForLunch;

        double difference = Math.abs(totalRemainingTime - tvShowTime);

        if (totalRemainingTime >= tvShowTime) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", name, Math.ceil(difference));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", name, Math.ceil(difference));
        }
    }
}