public class Programmer extends Employee {
    private int projectsCompleted;
    // Constructor for Programmer class
    public Programmer(String name, int birthYear, double rate, int projectsCompleted) {
        super(name, birthYear, rate);
        this.projectsCompleted = projectsCompleted;
    }
}