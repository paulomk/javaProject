public class Manager extends Employee {
    private final double GAIN_FACTOR_TRAVEL=100;
    private final double GAIN_FACTOR_CLIENT=500;
    private int traveledDays;
    private int newClients;

    // Constructors for Manager class

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
    public double annualBonus() {
        return newClients*GAIN_FACTOR_CLIENT+traveledDays*GAIN_FACTOR_TRAVEL;
    }
    @Override
    public String toString() {
        return super.toString()+ "He/She traveled "+traveledDays+" days and has brought "+newClients+" new clients.\nHis/Her estimated annual income is "+annualIncome();
    }
}
