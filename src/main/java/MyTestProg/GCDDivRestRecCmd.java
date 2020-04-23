package MyTestProg;

public class GCDDivRestRecCmd implements ICommand {
    public int EuclidDivisionRestRecursive(int a, int b){
        if (b == 0)
            return a;
        else return EuclidDivisionRestRecursive(b,a%b);
    }
    @Override
    public void execute() {
        System.out.println("Recursive Euclid's algorithm division rest");
        int a = Console.readIntFromStdin("Enter number for x: ");
        int b = Console.readIntFromStdin("Enter number for y: ");
        System.out.printf("%n x = " + a + ", y = " + b + "%n");
        System.out.println("Result: " + EuclidDivisionRestRecursive(a,b));
        System.out.println();
    }

    @Override
    public String toString() {
        return "Greatest Common Divisor (GCD) - (Recursive) Euclid's algorithm division rest";
    }
}
