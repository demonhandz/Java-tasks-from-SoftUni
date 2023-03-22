package FirstStepsInCodingExercise;

import java.util.Scanner;

public class BasketballEquipment08 {
    public static void main(String[] args) {
        /*• Баскетболни кецове – цената им е 40% по-малка от таксата за една година

• Баскетболен екип – цената му е 20% по-евтина от тази на кецовете

• Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип

• Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка */

        Scanner scanner = new Scanner(System.in);

        double tax = Double.parseDouble(scanner.nextLine());

        double sneakersPrice = tax - (tax * 0.40);
        double jerseyPrice = sneakersPrice - (sneakersPrice * 0.20);
        double ballPrice = jerseyPrice / 4;
        double accessories = ballPrice / 5;

        double totalPrice = tax + sneakersPrice + jerseyPrice + ballPrice + accessories;

        System.out.println(totalPrice);
    }
}
