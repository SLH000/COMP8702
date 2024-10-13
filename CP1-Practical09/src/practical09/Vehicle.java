package practical09;

public class Vehicle {  // base class
    private int capacity;
    private String make;
    public Vehicle(int capacity, String make){
        this.capacity=capacity;
        this.make=make;
    }
    public void print(){
        System.out.println("Vehicle Info: ");
        System.out.println("Capacity= "+capacity);
        System.out.println("make= " +make);
    }
    public void setCapacity(int capacity){
        System.out.println("New capacity = "+capacity);
        this.capacity=capacity;
    }

}
