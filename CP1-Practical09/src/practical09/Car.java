package practical09;

public class Car extends Vehicle {

// ... extra code here ...
    private String type, model;
    public Car(int capacity, String make, String type, String model){
        super(capacity,make);
        this.type=type;
        this.model=model;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("type = "+type);
        System.out.println("model = "+model);
    }

    @Override
    public void setCapacity(int capacity){
       System.out.println("Cannot change capacity of a car");
    }
}
