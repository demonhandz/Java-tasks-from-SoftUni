package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class Journey_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String typeVacation = "";

        switch (season) {
            case "summer":
                if (budget <= 100) {
                    destination = "Bulgaria";
                    typeVacation ="Camp";
                    budget = budget * 0.30;
                } else if (budget > 100 && budget <= 1000) {
                    destination = "Balkans";
                    typeVacation = "Camp";
                    budget = budget * 0.40;
                } else if (budget > 1000) {
                    destination = "Europe";
                    typeVacation = "Hotel";
                    budget = budget * 0.90;
                }
                break;
            case "winter":
                if (budget <= 100) {
                    destination = "Bulgaria";
                    typeVacation ="Hotel";
                    budget = budget * 0.70;
                } else if (budget > 100 && budget <= 1000) {
                    destination = "Balkans";
                    typeVacation = "Hotel";
                    budget = budget * 0.80;
                } else if (budget > 1000) {
                    destination = "Europe";
                    typeVacation = "Hotel";
                    budget = budget * 0.90;
                }
                break;
        }
        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", typeVacation, budget);
    }
}
