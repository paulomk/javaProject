public class Manager extends Employee {
    private int traveledDays;
    private int newClients;

    // Constructor for Manager class
    public Manager(String name, int birthYear, int newClients, int traveledDays, double rate) {
        super(name, birthYear, rate);
        this.traveledDays = traveledDays;
        this.newClients = newClients;
    }
    public Manager(String name, int birthYear, int newClients, int traveledDays, double rate, String vehicle) {
        super(name, birthYear, rate, vehicle);
        this.traveledDays = traveledDays;
        this.newClients = newClients;
    }
}
