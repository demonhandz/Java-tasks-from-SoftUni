package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class ArchitechtProjects {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int numOfProjects = Integer.parseInt(scan.nextLine());
        int sumOfProjects = numOfProjects * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, sumOfProjects, numOfProjects);
    }
}
