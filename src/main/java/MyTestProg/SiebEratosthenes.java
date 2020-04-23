package MyTestProg;

public class SiebEratosthenes implements ICommand {
    public void SieveEratosthenes(int a) {
        boolean[] prime = new boolean[a + 1];
        for (int i = 0; i < a; i++)
            prime[i] = true;
        for (int p = 2; p * p <= a; p++) {
            if (prime[p]) {
                for (int i = p * p; i <= a; i += p)
                    prime[i] = false;
            }
        }
        System.out.print("Prime numbers: ");
        for (int i = 2; i <= a; i++) {
            if (prime[i])
                System.out.print(i + " ");
        }
    }

    @Override
    public void execute() {
        System.out.println("Sieve of Eratosthenes");
        int a = Console.readIntFromStdin("Enter number for a: ");
        if (a < 2) {
            System.out.println("Choose number from 2");
            execute();
        }
        SieveEratosthenes(a);
        System.out.println();
    }

    @Override
    public String toString() {
        return "Sieve of Eratosthenes";
    }
}
