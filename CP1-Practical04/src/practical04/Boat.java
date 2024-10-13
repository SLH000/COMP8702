package practical04;

public class Boat {
   //Instance variable
    private int regNum;
    private int sequenceNumber;
    private String bClass, name;
    private double yardstick = 95.0;
    private static int count = 0;
    private Boat previousBoat;

    //default constructor
    public Boat (){
        this.bClass = "unknown";
        this.name = "unknown";
        this.regNum = -1;
        //count = count + 1;
        this.sequenceNumber = count;
    }
    //Print Method
    public void print() {
        System.out.println("Boat "+name +", Class = "+bClass+", Registration # = KA " + regNum);
        System.out.println("Sequence number = "+sequenceNumber);
    }

    //Parameterize constructor
    public Boat(String name, String bClass, int regNum) {
        this.regNum = regNum;
        this.bClass = bClass;
        this.name = name;
        count = count + 1;
        this.sequenceNumber = count;
    }
    //new constructor for Task 4.1.4
    public Boat(String name, String bClass, int regNum, Boat boat) {
        this.regNum = regNum;
        this.bClass = bClass;
        this.name = name;
        count = count + 1;
        this.sequenceNumber = count;
        this.previousBoat = boat;
    }
    //Set name
    public void setName(String name) {
        this.name = name;
    }
    //Get name
    public String getName(){
        return this.name;
    }

    public Boat getPreviousBoat() {
        return this.previousBoat;
    }
    // Method printing of boat created
    public static void printTotal(){
        System.out.println("Total number of boats created = " + count);
    }

}
