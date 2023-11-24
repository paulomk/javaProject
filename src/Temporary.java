public class Temporary extends Contract{
    //NO Exclusive fields

    //Constructor
    public Temporary(double hourlySalary, int accumulatedHours){
        super(hourlySalary, accumulatedHours); //hourly and calculate by hour
    }

    //Methods
    @Override
    public String toString(){
        return String.format("he/she is a temporary employee with %.2f " +
                "hourly salary and he has worked for %d hours.\n", hourlyMonthlySalary, hoursDaysWorked);
    }

    @Override
    public double accumulatedSalary() {
        return hourlyMonthlySalary * hoursDaysWorked;
    }
}
