package WhileLoop;

import java.util.Scanner;

public class Graduation_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String student = scanner.nextLine();
        int goodGradesCount = 0;
        int poorGradesCount = 0;
        double allGradesSum = 0;

        while (goodGradesCount < 12) {
            double grade = Double.parseDouble(scanner.nextLine());

            if (poorGradesCount == 2) {

                break;
            }

            if (grade < 4) {
                poorGradesCount++;
                grade = Double.parseDouble(scanner.nextLine());
                continue;
            }
            allGradesSum += grade;
        }
    }
}
