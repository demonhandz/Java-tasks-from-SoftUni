import java.util.Scanner;

public class EndOfLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lineNumber = 0;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            lineNumber++;
            System.out.println(lineNumber + " " + line);
        }
        scanner.close();
    }
}
