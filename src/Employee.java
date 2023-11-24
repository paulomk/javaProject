import java.util.Calendar;
public class Employee {
    final private String name;
    private int birthYear;
    private double rate;
    private Vehicle vehicle;
    private Contract contract;

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

    /**
     * This method makes an employee sign a contract. In case they already have a contract, it calls the method to calculate
     * accumulated salary before applying the new contract.
     * @param contract of a Contract type
     */
    public void signContract(Contract contract){
        if (this.contract != null){
            contract.accumulatedSalary(); //calculate before
        }
        this.contract = contract;
    }

    public String contractInfo(){
        return name + " is a " + this.getClass().getName() + " " + this.contract;
    }

    public Contract getContract() { //this get method is necessary to access the polymorphed method "accumulatedSalary"
        return contract;
    }
}
