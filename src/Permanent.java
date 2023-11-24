public class Permanent extends Contract {
    private int nbChildren;
    private boolean married;
    private double bonusPerChildPerMonth;

    public Permanent(
            int nbChildren, boolean married, double monthlySalary,
            double bonusPerChildPerMonth, int accumulatedDays){
        super(monthlySalary, accumulatedDays); //
        this.nbChildren = nbChildren;
        this.married = married;
        this.bonusPerChildPerMonth = bonusPerChildPerMonth;
    }
    public double accumulatedSalary(){
        return 1; //implement me
    }

    @Override
    public String toString(){
        return "a"; //implement me
    }

}
