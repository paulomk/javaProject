public class Programmer extends Employee {
    private int projectsCompleted;
    // Constructor for Programmer class
    public Programmer(String name, int birthYear, int projectsCompleted, double rate) {
        super(name, birthYear, rate);
        this.projectsCompleted = projectsCompleted;
    }
    public Programmer(String name, int birthYear, int projectsCompleted, double rate, String vehicle) {
        super(name, birthYear, rate, vehicle);
        this.projectsCompleted = projectsCompleted;
    }
}