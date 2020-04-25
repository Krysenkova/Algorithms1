package MyTestProg;

public class GCDSubRRecCmd implements ICommand {

    public int EuclidSubtractionRecursive(int a, int b) {
        if (b == 0)
            return a;
        else if (a == 0)
            return b;
        else if (a > b)
            return EuclidSubtractionRecursive(a - b, b);
        else return EuclidSubtractionRecursive(a, b - a);
    }

    @Override
    public void execute() {
        System.out.println("Recursive Euclid's algorithm subtraction");
        int a = Console.readIntFromStdin("Enter number for x: ");
        int b = Console.readIntFromStdin("Enter number for y: ");
        System.out.printf("%nx = " + a + ", y = " + b + "%n");
        System.out.println("Result: " + EuclidSubtractionRecursive(a, b));
        System.out.println();
    }

    @Override
    public String toString() {
        return "Greatest Common Divisor (GCD) - (Recursive) Euclid's algorithm subtraction";
    }
}
