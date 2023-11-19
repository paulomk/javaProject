public class Tester extends Employee {
    private int bugsSolved;
    // Constructor for Tester class
    public Tester(String name, int birthYear, int bugsSolved, double rate) {
        super(name, birthYear, rate);
        this.bugsSolved = bugsSolved;
    }
    public Tester(String name, int birthYear, int bugsSolved, double rate, String vehicle) {
        super(name, birthYear, rate, vehicle);
        this.bugsSolved = bugsSolved;
    }
}
