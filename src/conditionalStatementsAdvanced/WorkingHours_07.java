package conditionalStatementsAdvanced;

import java.util.Scanner;

public class WorkingHours_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int workHours = Integer.parseInt(scanner.nextLine());
        String workDay = scanner.nextLine();

        switch (workDay) {
            case "Monday" :
            case "Tuesday" :
            case "Wednesday" :
            case "Thursday" :
            case "Friday" :
            case "Saturday" :
                if(workHours >= 10 && workHours <= 18) {
                    System.out.println("open");
                    break;
                }
            default:
                System.out.println("closed");
        }
    }
}