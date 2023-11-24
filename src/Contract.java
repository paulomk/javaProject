public abstract class Contract {
    //Fields
    protected double hourlyMonthlySalary;
    protected int hoursDaysWorked;

    //Constructor
    public Contract(double hourlyMonthlySalary, int hoursDaysWorked){
        this.hourlyMonthlySalary = hourlyMonthlySalary;
        this.hoursDaysWorked = hoursDaysWorked;
    }

    //Methods
    public abstract double accumulatedSalary();
}
