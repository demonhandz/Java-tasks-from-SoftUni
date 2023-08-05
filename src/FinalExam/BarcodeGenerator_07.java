package FinalExam;

import java.util.Scanner;

public class BarcodeGenerator_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startRange = Integer.parseInt(scanner.nextLine());
        int endRange = Integer.parseInt(scanner.nextLine());

        for (int barcode = startRange; barcode <= endRange; barcode++) {
            if (containsEvenDigits(barcode)) {
                System.out.print(barcode + " ");
            }
        }
    }

    private static boolean containsEvenDigits(int number) {
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
}
