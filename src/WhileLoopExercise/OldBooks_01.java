package WhileLoopExercise;

import java.util.Scanner;

public class OldBooks_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String wantedBook = scanner.nextLine();

        boolean theBookIsFound = false;
        int countBooks = 0;
        String command = scanner.nextLine(); //book or "No More Books"

        while (!command.equals("No More Books")) {
            String currentBook = command;

            if(command.equals(wantedBook)) {
                theBookIsFound = true;
                break;
            }
            countBooks++;


            command = scanner.nextLine();
        }

        if(theBookIsFound) {
            System.out.printf("You checked %d books and found it.", countBooks);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", countBooks);
        }

    }
}
