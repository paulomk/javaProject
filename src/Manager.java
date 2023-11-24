public class Manager extends Employee {
    private int traveledDays;
    private int newClients;

    // Constructor for Manager class

    public Manager(String name, int birthYear, int newClients, int traveledDays) {
        this(name, birthYear, newClients, traveledDays, 0.0, null);
    }

    public Manager(String name, int birthYear, int newClients, int traveledDays, double rate) {
        this(name, birthYear, newClients, traveledDays, rate, null);
    }

    public Manager(String name, int birthYear, int newClients, int traveledDays, double rate, Vehicle vehicle) {
        super(name, birthYear, rate, vehicle);
        this.traveledDays = traveledDays;
        this.newClients = newClients;
    }
    public Manager(String name, int birthYear, int newClients, int traveledDays, Vehicle vehicle) {
        super(name, birthYear, 0.0, vehicle);
        this.traveledDays = traveledDays;
        this.newClients = newClients;
    }

}
