import java.util.Calendar;
public class Employee {
    final private String name;
    private int birthYear;
    private double rate;
    private String vehicle; //placeholder for the vehicle object
    public Employee(String name, int birthYear, double rate) {
        this.name = name;
        this.birthYear = birthYear;
        this.rate = rate;
    }
    public Employee(String name, int birthYear, double rate, String vehicle) {
        this(name,birthYear,rate);
        this.vehicle = vehicle;
    }
    /**
     * Computed property age
     * @return the age of the employee
     */
    public int getAge(){
        Calendar cal = Calendar.getInstance();
        int currentYear = cal.get(Calendar.YEAR);
        return currentYear-birthYear;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public double getRate() {
        return rate;
    }

    public String getVehicle() {
        return vehicle;
    }
}
