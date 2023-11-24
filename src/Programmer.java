public class Programmer extends Employee {
    private int projectsCompleted;
    // Constructor for Programmer class
    public Programmer(String name, int birthYear, int projectsCompleted) {
        this(name, birthYear, projectsCompleted, 0.0, null);
    }
    public Programmer(String name, int birthYear, int projectsCompleted, double rate) {
        this(name, birthYear, projectsCompleted, rate, null);
    }
    public Programmer(String name, int birthYear, int projectsCompleted, double rate, Vehicle vehicle) {
        super(name, birthYear, rate, vehicle);
        this.projectsCompleted = projectsCompleted;
    }
    public Programmer(String name, int birthYear, int projectsCompleted, Vehicle vehicle) {
        super(name, birthYear, 0.0, vehicle);
        this.projectsCompleted = projectsCompleted;
    }

}