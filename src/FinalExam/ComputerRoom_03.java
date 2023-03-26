package FinalExam;

import java.util.Scanner;

public class ComputerRoom_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int hours = Integer.parseInt(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        String timeOfDay = scanner.nextLine();

        double pricePerHour = 0;
        if ((month.equals("march") || month.equals("april") || month.equals("may")) && timeOfDay.equals("day")) {
            pricePerHour = 10.50;
        } else if ((month.equals("june") || month.equals("july") || month.equals("august")) && timeOfDay.equals("day")) {
            pricePerHour = 12.60;
        } else if ((month.equals("march") || month.equals("april") || month.equals("may")) && timeOfDay.equals("night")) {
            pricePerHour = 8.40;
        } else if ((month.equals("june") || month.equals("july") || month.equals("august")) && timeOfDay.equals("night")) {
            pricePerHour = 10.20;
        }

        if (people >= 4) {
            pricePerHour *= 0.9;
        }

        double totalCost = pricePerHour * hours * people;
        double pricePerPersonPerHour = pricePerHour;

        if (hours >= 5) {
            pricePerPersonPerHour *= 0.5;
            totalCost *= 0.5;
        }

        System.out.printf("Price per person for one hour: %.2f%n", pricePerPersonPerHour);
        System.out.printf("Total cost of the visit: %.2f", totalCost);
    }
}
