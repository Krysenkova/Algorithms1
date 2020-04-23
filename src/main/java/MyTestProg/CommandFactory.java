package MyTestProg;

public class CommandFactory {

    public ICommand createGCDSubRRecCmd() {
        return new GCDSubRRecCmd();
    }

    public ICommand createGCDSubItCmd() {
        return new GCDSubItCmd();
    }

    public ICommand createGCDDivRestRecCmd() {
        return new GCDDivRestRecCmd();
    }

    public ICommand createGCDDivRestIteCmd() {
        return new GCDDivRestIteCmd();
    }

    public ICommand createSiebEratosthenes() {
        return new SiebEratosthenes();
    }
}
