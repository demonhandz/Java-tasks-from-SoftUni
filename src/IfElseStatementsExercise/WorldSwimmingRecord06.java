package IfElseStatementsExercise;

import java.util.Scanner;

public class WorldSwimmingRecord06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordTime = Double.parseDouble(scanner.nextLine());
        double distanceInMetres = Double.parseDouble(scanner.nextLine());
        double secondsTime = Double.parseDouble(scanner.nextLine());

        double distance = distanceInMetres *  secondsTime;

        double addedTime = Math.floor(distanceInMetres / 15);
        double addedTimeSum = addedTime * 12.5;
        double totalTime = distance + addedTimeSum;

        if (recordTime > totalTime) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", totalTime - recordTime);
        }
    }
}
