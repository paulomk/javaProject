public class Car extends Vehicle{
    //Attributes
    private Gear gear;
    private CarType type;

    //Getter and Setter
    public Gear getGear() {
        return gear;
    }

    //Constructor
    public void setGear(Gear gear) {
        this.gear = gear;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public Car (String make, String plate, String color, VehicleType category,Gear gear, CarType carType){
        super(make, plate, color, category);
        this.type = carType;
        this.gear = gear;
    }
}


enum CarType{
    Sport, SUV, Hatchback, Minivan, Sedan
}

enum Gear{
    Manual, Automatic
}