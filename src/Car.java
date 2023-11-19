public class Car extends Vehicle{
    //Attributes
    private Gear gear;
    private CarType type;

    //Getter and Setter
    public Gear getGear() {
        return gear;
    }

    public void setGear(Gear gear) {
        this.gear = gear;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    //Constructor
    public Car (String make, String plate, String color, VehicleType category,Gear gear, CarType carType){
        super(make, plate, color, category);
        this.type = carType;
        this.gear = gear;
    }

    //Method
    @Override
    public String toString(){
        String vehicle = super.toString();
        String trailer = "\n\t- gear type: " + this.gear +
                "\n\t- type: " + this.type;
        return vehicle + trailer;
    }
}


enum CarType{
    Sport, SUV, Hatchback, Minivan, Sedan;
}

enum Gear{
    Manual, Automatic
}