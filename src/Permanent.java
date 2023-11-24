public class Permanent extends Contract {
    //Fields
    private int nbChildren;
    private boolean married;
    private double bonusPerChildPerMonth;

    //Constructor
    public Permanent(
            int nbChildren, boolean married, double monthlySalary,
            double bonusPerChildPerMonth, int accumulatedDays){
        super(monthlySalary, accumulatedDays); //monthly and calculated by days
        this.nbChildren = nbChildren;
        this.married = married;
        this.bonusPerChildPerMonth = bonusPerChildPerMonth;
    }

    //Methods
    /**
     * This is a method to calculate the bonus, which is applied to married permanent employees.
     * If not married, no bonus is applied and zero is returned.
     * @return the bonus to be paid
     */
    public double calculateMonthlyBonus(){
        double bonus = 0;
        if (married) {
            bonus =  bonusPerChildPerMonth * nbChildren;
        }
        return bonus; //default is zero
    }

    /**
     *Permanent employees receive salary monthly, so it should be applied a pro rata basis in case the month is not completed.
     * This function takes into consideration a month with 20 workdays (local variable workdays).
     * @return
     */
    @Override
    public double accumulatedSalary(){
        int workdays = 20;
        return (hourlyMonthlySalary + calculateMonthlyBonus()) * hoursDaysWorked/workdays;
    }

    @Override
    public String toString(){
        return String.format("he/she is%s married and he/she has %d children. " +
                        "He/She has worked for %d days and upon contract his/her" +
                " monthly salary is %.2f\n",
                !married ? " not":"",
                nbChildren, hoursDaysWorked, hourlyMonthlySalary);

    }


}
