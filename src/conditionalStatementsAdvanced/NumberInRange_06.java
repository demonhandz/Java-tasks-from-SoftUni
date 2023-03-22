package conditionalStatementsAdvanced;

import java.util.Scanner;

public class NumberInRange_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int range = Integer.parseInt(scanner.nextLine());
        // [-100, 100] && range !=0
        if (range >= -100 && range <= 100 && range != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
