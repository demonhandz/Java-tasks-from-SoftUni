package FinalExam;

import java.util.Scanner;

public class ProgrammingBook_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pricePerPage = Double.parseDouble(scanner.nextLine());
        double pricePerCover = Double.parseDouble(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());
        double designerFee = Double.parseDouble(scanner.nextLine());
        int teamDiscount = Integer.parseInt(scanner.nextLine());

        int pageCount = 899;
        int coverCount = 2;
        double totalPrice = pageCount * pricePerPage + coverCount * pricePerCover;
        double discountAmount = totalPrice * discount / 100.0;
        double finalPrice = totalPrice - discountAmount + designerFee;
        double teamDiscountAmount = finalPrice * teamDiscount / 100.0;
        double avtonomPayment = finalPrice - teamDiscountAmount;

        System.out.printf("Avtonom should pay %.2f BGN.", avtonomPayment);
    }
}
