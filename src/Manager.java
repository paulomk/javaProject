public class Manager extends Employee {
    private int traveledDays;
    private int newClients;

    // Constructor for Manager class
    public Manager(String name, int birthYear,  int traveledDays, int newClients, double rate) {
        super(name, birthYear, rate);
        this.traveledDays = traveledDays;
        this.newClients = newClients;
    }

    public Manager(String name, int birthYear, double rate, String vehicle, int traveledDays, int newClients) {
        super(name, birthYear, rate, vehicle);
        this.traveledDays = traveledDays;
        this.newClients = newClients;
    }
}
