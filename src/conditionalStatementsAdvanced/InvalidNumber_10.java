package conditionalStatementsAdvanced;

import java.util.Scanner;

public class InvalidNumber_10 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        boolean isValid = (input >= 100 && input <=200) || input == 0;

        if(!isValid) {
            System.out.println("invalid");
        }
    }
}
