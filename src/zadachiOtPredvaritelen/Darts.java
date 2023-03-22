package zadachiOtPredvaritelen;

import java.util.Scanner;

public class Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int points = 301;
        int successfulShots = 0;
        int unsuccessfulShots = 0;

        while (points != 0){
            String input = scanner.nextLine();
            if (input.equals("Retire")){
                break;
            }

            int currentPoints = Integer.parseInt(scanner.nextLine());

            if (input.equals("Triple")){
                currentPoints *= 3;
            }else if (input.equals("Double")){
                currentPoints *= 2;
            }

            if (currentPoints > points){
                unsuccessfulShots++;
            }else {
                points -= currentPoints;
                successfulShots++;
            }
        }

        if (points == 0){
            System.out.printf("%s won the leg with %d shots.", name, successfulShots);
        }else {
            System.out.printf("%s retired after %d unsuccessful shots.", name, unsuccessfulShots);
        }

    }
}
