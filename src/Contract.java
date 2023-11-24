public abstract class Contract {
    double hourlyMonthlySalary;
    int hoursDaysWorked;

    //Constructor
    public Contract(double hourlyMonthlySalary, int hoursDaysWorked){
        this.hourlyMonthlySalary = hourlyMonthlySalary;
        this.hoursDaysWorked = hoursDaysWorked;
    }

    //Methods
    public abstract double accumulatedSalary();
}
