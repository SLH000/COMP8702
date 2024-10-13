package practical09;
import java.util.ArrayList;
public class VehicleDB {
    private int n;

    public VehicleDB(int n) {
        this.n = n;
    }
    ArrayList<Vehicle> db = new ArrayList<Vehicle>(100);

    public void addVehicle(Vehicle c) {
        db.add(c);
    }
    public void print() {
        System.out.println("=== Vehicle Data Base ===");
        for (Vehicle v : db) {
            v.print();
        }
    }
}
