package MyTestProg;

public class GCDDivRestIteCmd implements ICommand {

    public int EuclidDivisionRestIterative(int a, int b) {
        while (b != 0) {
            int h = a % b;
            a = b;
            b = h;
        }
        return a;

    }

    @Override
    public void execute() {
        System.out.println("Iterative Euclid's algorithm division rest");
        int a = Console.readIntFromStdin("Enter number for x: ");
        int b = Console.readIntFromStdin("Enter number for y: ");
        System.out.printf("%n x = " + a + ", y = " + b + "%n");
        System.out.println("Result: " + EuclidDivisionRestIterative(a,b));
        System.out.println();
    }
    @Override
    public String toString() {
        return "Greatest Common Divisor (GCD) - (Iterative) Euclid's algorithm division rest";
    }
}
