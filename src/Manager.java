public class Manager extends Employee {
    private int traveledDays;
    private int newClients;

    // Constructor for Manager class

    public Manager(String name, int birthYear, int newClients, int traveledDays) {
        this(name, birthYear, newClients, traveledDays, 100, null);
    }

    public Manager(String name, int birthYear, int newClients, int traveledDays, int rate) {
        this(name, birthYear, newClients, traveledDays, rate, null);
    }

    public Manager(String name, int birthYear, int newClients, int traveledDays, int rate, Vehicle vehicle) {
        super(name, birthYear, rate, vehicle);
        this.traveledDays = traveledDays;
        this.newClients = newClients;
    }
    public Manager(String name, int birthYear, int newClients, int traveledDays, Vehicle vehicle) {
        super(name, birthYear, 100, vehicle);
        this.traveledDays = traveledDays;
        this.newClients = newClients;
    }

    @Override
    public String toString() {
        return super.toString()+ "He/She traveled "+traveledDays+" days and has brought "+newClients+" new clients.\n";
    }
}
