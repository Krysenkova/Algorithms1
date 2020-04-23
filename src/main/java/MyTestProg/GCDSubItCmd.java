package MyTestProg;

public class GCDSubItCmd implements ICommand {

    public int EuclidSubtractionIterative(int a, int b) {
        if (a == b)
            return b;
        while (b != 0) {
            if (a > b) {
                a = a - b;
            } else b = b - a;
        }
        return b;
    }


    @Override
    public void execute() {
        System.out.println("Iterative Euclid's algorithm subtraction");
        int a = Console.readIntFromStdin("Enter number for x: ");
        int b = Console.readIntFromStdin("Enter number for y: ");
        System.out.printf("%n x = " + a + ", y = " + b + "%n");
        System.out.println("Result: " + EuclidSubtractionIterative(a,b));
        System.out.println();
    }

    @Override
    public String toString() {
        return "Greatest Common Divisor (GCD) - (Iterative) Euclid's algorithm subtraction";
    }
}
