package FirstStepsInCodingExercise;

import java.util.Scanner;

public class Repainting06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
       /* 1. Необходимо количество найлон (в кв.м.) - цяло число в интервала [1... 100]
        2. Необходимо количество боя (в литри) - цяло число в интервала [1…100]
        3. Количество разредител (в литри) - цяло число в интервала [1…30]
        4. Часовете, за които майсторите ще свършат работата - цяло число в интервала [1…9] */

        double nylonSquareMetres = Double.parseDouble(scanner.nextLine());
        double paintLitres = Double.parseDouble(scanner.nextLine());
        double thinnerLitres = Double.parseDouble(scanner.nextLine());
        int workerHours = Integer.parseInt(scanner.nextLine());

        double nylonPrice = (nylonSquareMetres + 2) * 1.50;
        double paintPrice = (paintLitres + paintLitres * 0.10) * 14.50;
        double thinnerPrice = thinnerLitres * 5.00;

        double priceMaterials = nylonPrice + paintPrice + thinnerPrice + 0.40;
        double priceWorkers = (priceMaterials * 0.30) * workerHours;
        double finalPrice = priceMaterials + priceWorkers;

        System.out.println(finalPrice);
    }
}
