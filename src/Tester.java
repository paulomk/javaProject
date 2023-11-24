public class Tester extends Employee {
    private int bugsSolved;
    // Constructor for Tester class

    public Tester(String name, int birthYear, int bugsSolved) {
        this(name, birthYear, bugsSolved, 100, null);
    }

    public Tester(String name, int birthYear, int bugsSolved, double rate) {
        this(name, birthYear, bugsSolved, rate, null);
    }

    public Tester(String name, int birthYear, int bugsSolved, double rate, Vehicle vehicle) {
        super(name, birthYear, rate, vehicle);
        this.bugsSolved = bugsSolved;
    }

}
