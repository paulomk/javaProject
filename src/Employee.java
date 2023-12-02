import java.util.Calendar;
abstract public class Employee {
    final private String name;
    private int birthYear;
    private int rate;
    private Vehicle vehicle;
    private Contract contract;

    public Employee(String name, int birthYear, int rate, Vehicle vehicle) {
        this.name = name;
        this.birthYear = birthYear;
        this.rate = rate<10?10:rate>100?100:rate; //checking to maintain the min 10 and max 100 boundary
        this.vehicle = vehicle;
        System.out.println("We have a new employee: "+name+", a "+this.getClass().getSimpleName().toLowerCase()+".");
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

    @Override
    public String toString() {

        return "Name: " + name +", a "+ this.getClass().getSimpleName()+"\n" +
                "Age: " + getAge() +"\n"+
                "Employee has a "+vehicle.getClass().getSimpleName().toLowerCase()+"\n" + vehicle+"\n"+
                name + " has an Occupation rate: "+rate+"% ";
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

    /**
     * Abstract method for calculating annual bonus as the calculation is different for employee types
     * @return double annual bonus
     */
    abstract public double annualBonus();
    public double annualIncome(){
        double annualSalary = getContract()!=null?getContract().accumulatedSalary()*12*(getRate()/100.0):0;
        return annualSalary+annualBonus();

    }
}
