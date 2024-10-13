package practical09;

public class HoldenDB extends VehicleDB{
    public HoldenDB() {
        super(50);
    }
    public void addCar(int capacity, String type, String model){
        Car carN =  new Car(capacity, "Holden", type, model);
        addVehicle(carN);
        }
 }

