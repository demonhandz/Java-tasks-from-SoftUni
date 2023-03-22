package FirstStepsInCodingExercise;

import java.util.Scanner;

public class Aquarium09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        /*1. Дължина в см – цяло число в интервала [10 … 500]
          2. Широчина в см – цяло число в интервала [10 … 300]
          3. Височина в см – цяло число в интервала [10… 200]
          4. Процент – реално число в интервала [0.000 … 100.000]*/

        int volume = length * width * height;
        double volumeLitres = volume * 0.001;
        double spaceTaken = volumeLitres * (1 - (percent * 0.01));

        System.out.printf("Space taken to fill the aquarium is %f", spaceTaken);
    }
}
