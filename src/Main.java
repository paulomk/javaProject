import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //INITIAL CODE

        //Test part 1
        System.out.println("Test 1: ");
        var management = new Management();
        management.hireTest1();

        // Test part 2
        System.out.println("Test 2: ");
        System.out.println("Employees description: ");
        management.hireTest2();

        // Test part 3
        System.out.println("Test 3: ");
        System.out.println("Employees description: ");
        management.hireTest3();

        //TEST CODE
//        Employee e = new Employee("ad", 2020,5);
//        Employee e2 = new Employee("dasd", 2011, 7, "car");
//
//        System.out.println(e2);

        //Testing newContract
//        System.out.println("Contract change test");
//
//        Car vt4 = new Car("Mazda", "Custom Plate", "White", VehicleType.Family, Gear.Automatic, CarType.SUV);
//        Employee Matt = new Programmer("Matt", 1981, 5, 110, vt4);
//        Contract t2 = new Temporary(50, 60);
//
//        Matt.signContract(t2);
//        System.out.println(Matt.getName() + " " + Matt.getContract().getClass().getName() + " " + Matt.getContract().accumulatedSalary());
//
//        // updating Matt's contract
//        Contract p5 = new Permanent(1, true, 5000, 200, 30);
//        Matt.signContract(p5);
//        System.out.println(Matt.getName() + " " + Matt.getContract().getClass().getName() + " " + Matt.getContract().accumulatedSalary());
    }
}
