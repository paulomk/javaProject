public class Motorcycle extends Vehicle{
    //Attributes
    private boolean hasSidecar;

    //Getters and Setters
    public void setHasSidecar(boolean sidecar){
        this.hasSidecar = sidecar;
    }

    public boolean getHasSidecar(){
        return this.hasSidecar;
    }

    //Constructor
    public Motorcycle(String make, String plate, String color, VehicleType category, boolean sidecar){
        super(make, plate, color, category);
        this.hasSidecar = sidecar;

    }
}
