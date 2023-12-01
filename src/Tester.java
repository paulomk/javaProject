public class Tester extends Employee {
    private final double GAIN_FACTOR_ERROR = 10;
    private final int bugsSolved;
    // Constructor for Tester class

    public Tester(String name, int birthYear, int bugsSolved) {
        this(name, birthYear, bugsSolved, 100, null);
    }

    public Tester(String name, int birthYear, int bugsSolved, int rate) {
        this(name, birthYear, bugsSolved, rate, null);
    }

    public Tester(String name, int birthYear, int bugsSolved, int rate, Vehicle vehicle) {
        super(name, birthYear, rate, vehicle);
        this.bugsSolved = bugsSolved;
    }

    @Override
    public double annualBonus() {
        return bugsSolved*GAIN_FACTOR_ERROR;
    }
    public String toString(){
        return super.toString()+" and corrected "+bugsSolved+" bugs.\nHis/Her estimated annual income is "+annualIncome();
    }

}
