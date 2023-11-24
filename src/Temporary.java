public class Temporary extends Contract{

    public Temporary(double hourlySalary, int accumulatedHours){
        super(hourlySalary, accumulatedHours);
    }

    public double accumulatedSalary(){
        return 1; //implement me
    }

    @Override
    public String toString(){
        return "a"; //implement me
    }
}
