package FirstStepsInCodingExercise;

import java.util.Scanner;

public class RadiansToDegrees02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radians = Double.parseDouble(scanner.nextLine());
        //градус = радиан * 180 / π

        double deg = radians * 180 / Math.PI;

        System.out.println(deg);
    }
}
