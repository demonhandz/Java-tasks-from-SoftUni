package zadachiOtPredvaritelen;

import java.util.Scanner;

public class tennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int games = Integer.parseInt(scanner.nextLine());

        int initialPoints = Integer.parseInt(scanner.nextLine());
        int receivedPoints = 0;
        int wins = 0;

        for (int i = 0; i < games; i++) {

            String input = scanner.nextLine();

            switch (input) {
                case "W":
                    receivedPoints += 2000;
                    wins++;
                    break;
                case "F":
                    receivedPoints += 1200;
                    break;
                case "SF":
                    receivedPoints += 720;
                    break;
            }
        }

        System.out.printf("Final points: %d\n", receivedPoints + initialPoints);
        System.out.printf("Average points: %.0f\n",  Math.floor(receivedPoints * 1.0 / games));
        System.out.printf("%.2f%%", wins * 1.0 / games * 100);
    }
}

