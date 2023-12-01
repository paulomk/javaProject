public class Programmer extends Employee {
    private final int projectsCompleted;
    // Constructor for Programmer class
    public Programmer(String name, int birthYear, int projectsCompleted) {
        this(name, birthYear, projectsCompleted, 100, null);
    }
    public Programmer(String name, int birthYear, int projectsCompleted, int rate) {
        this(name, birthYear, projectsCompleted, rate, null);
    }
    public Programmer(String name, int birthYear, int projectsCompleted, int rate, Vehicle vehicle) {
        super(name, birthYear, rate, vehicle);
        this.projectsCompleted = projectsCompleted;
    }
    public Programmer(String name, int birthYear, int projectsCompleted, Vehicle vehicle) {
        super(name, birthYear, 100, vehicle);
        this.projectsCompleted = projectsCompleted;
    }

    @Override
    public String toString() {
        return super.toString()+" and completed "+projectsCompleted+" projects.\n";
    }
}