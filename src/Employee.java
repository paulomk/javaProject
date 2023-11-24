import java.util.Calendar;
public class Employee {
    final private String name;
    private int birthYear;
    private double rate;
    private Vehicle vehicle;

    public Employee(String name, int birthYear, double rate, Vehicle vehicle) {
        this.name = name;
        this.birthYear = birthYear;
        this.rate = rate<10?10:rate>100?100:rate;
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

//    public String getVehicle() {
//        return vehicle;
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                ", rate=" + rate +
                ", vehicle='" + vehicle + '\'' +
                '}';
    }
}
