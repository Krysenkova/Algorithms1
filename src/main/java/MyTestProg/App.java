/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package MyTestProg;

import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        CommandFactory cmdFactory = new CommandFactory();
        LinkedList<ICommand> commands = new LinkedList<>();
        int option;

        commands.add(cmdFactory.createGCDSubRRecCmd());
        commands.add(cmdFactory.createGCDSubItCmd());
        commands.add(cmdFactory.createGCDDivRestRecCmd());
        commands.add(cmdFactory.createGCDDivRestIteCmd());
        commands.add(cmdFactory.createSiebEratosthenes());
        do {
            System.out.println("Console-Application: Exercise-1");

            for (int i = 0; i < commands.size(); i++) {
                System.out.printf("%d. %s\n", i + 1, commands.get(i).toString());
            }
            System.out.println("0. Exit");


            do {
                option = Console.readIntFromStdin("Please enter the number of an option: ");
                if (option > 0 && option <= 5)
                    commands.get(option - 1).execute();
                else if (option == 0)
                    System.exit(0);
                else {
                    System.out.println("Wrong input! Try again!");
                }
            } while (option < 0 || option > 6);
        } while (true);
    }
}

