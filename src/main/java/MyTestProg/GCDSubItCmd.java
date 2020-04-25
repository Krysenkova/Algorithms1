package MyTestProg;

public class GCDSubItCmd implements ICommand {

    public int EuclidSubtractionIterative(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else b -= a;
        }
        return b;
    }


    @Override
    public void execute() {
        System.out.println("Iterative Euclid's algorithm subtraction");
        int a = Console.readIntFromStdin("Enter number for x: ");
        int b = Console.readIntFromStdin("Enter number for y: ");
        System.out.printf("%nx = " + a + ", y = " + b + "%n");
        System.out.println("Result: " + EuclidSubtractionIterative(a,b));
        System.out.println();
    }

    @Override
    public String toString() {
        return "Greatest Common Divisor (GCD) - (Iterative) Euclid's algorithm subtraction";
    }
}
