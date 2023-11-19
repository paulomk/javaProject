public class Tester extends Employee {
    private int bugsSolved;

    // Constructor for Tester class
    public Tester(String name, int birthYear, double rate, int bugsSolved) {
        super(name, birthYear, rate);
        this.bugsSolved = bugsSolved;
    }
}
