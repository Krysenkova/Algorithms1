package MyTestProg;

import java.util.Scanner;

public class Console {

    public static int readIntFromStdin(String text) {

        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println(text);
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                return number;
            }else
            return readIntFromStdin(scanner.next() + " is not a number. Try again!");
    }


   /* public static String readStringFromStdin(String text) {
        Scanner scanner = new Scanner(System.in);
        String someText;
        System.out.print( text + ": ");
        someText = scanner.next();
        return someText;
    }*/
}