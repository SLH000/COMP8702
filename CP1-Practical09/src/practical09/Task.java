package practical09;

/* public class Task {

   public static void main(String[] args) {
        Car car1 = new Car(1200, "Holden", "sedan", "Barina");
        Car car2 = new Car(1500, "Mazda", "sedan", "323");
        car1.print();
        car2.print();
    }
}
public class Task {
    public static void main(String[] args) {
        Car car1 = new Car(1200, "Holden", "sedan", "Barina");
        Vehicle v1 = new Vehicle(1500, "Mazda");
        v1.setCapacity(1600);
        v1.print();
        car1.setCapacity(1600);
        car1.print();
    }
}
public class Task {
    public static void main(String[] args) {
        VehicleDB db = new VehicleDB();
        db.addVehicle(new Car(1200, "Holden", "sedan", "Barina"));
        db.addVehicle(new Vehicle(1500, "Mazda"));
        db.print();
    }
}*/
public class Task {
    public static void main(String[] args) {
        HoldenDB db = new HoldenDB();
        db.addCar(1200, "sedan", "Barina");
        db.addCar(3800, "wagon", "Commodore");
        db.print();
    }
}
