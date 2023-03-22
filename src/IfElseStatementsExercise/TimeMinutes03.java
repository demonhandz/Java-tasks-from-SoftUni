package IfElseStatementsExercise;

import java.util.Scanner;

public class TimeMinutes03 {
    public static void main(String[] args) {
        /*Да се напише програма, която чете час и минути от 24-часово денонощие, въведени от потребителя и
        изчислява колко ще е часът след 15 минути. Резултатът да се отпечата във формат часове:минути. Часовете
        винаги са между 0 и 23, а минутите винаги са между 0 и 59. Часовете се изписват с една или две цифри.
        Минутите се изписват винаги с по две цифри, с водеща нула, когато е необходимо.*/
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalMin = hours * 60 + minutes + 15;
        hours = totalMin / 60;
        minutes = totalMin % 60;

        if (hours > 23) {
            hours = hours - 24;
        }
        if (minutes < 10) {
            System.out.printf("%d:0%d",hours, minutes);
        } else {
            System.out.printf("%d:%d", hours, minutes);
        }
    }
}
