package TasksFromPreExam;

import java.util.Scanner;

public class basketballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wins = 0;
        int loses = 0;
        int allGames = 0;

        String input = scanner.nextLine();

        while (!input.equals("End of tournaments")) {
            int games = Integer.parseInt(scanner.nextLine());

            for (int i = 1; i <= games; i++) {
                int myPoints = Integer.parseInt(scanner.nextLine());
                int enemyPoints = Integer.parseInt(scanner.nextLine());
                allGames++;

                if (myPoints > enemyPoints) {
                    wins++;
                    System.out.printf("Game %d of tournament %s: win with %d points.\n",
                            i, input, myPoints - enemyPoints);
                } else {
                    loses++;
                    System.out.printf("Game %d of tournament %s: lost with %d points.\n",
                            i, input, enemyPoints - myPoints);
                }

            }

            input = scanner.nextLine();
        }
        System.out.printf("%.2f%% matches win\n", 100.0 * wins / allGames);
        System.out.printf("%.2f%% matches lost\n", loses * 1.0 / allGames * 100);

    }
}
