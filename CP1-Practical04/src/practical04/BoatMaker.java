package practical04;

public class BoatMaker {

    public static void main(String[] args) {
        /*System.out.println("Starting boat application");
        Boat myboat = new Boat();

         Boat myboat1 = new Boat();
         Boat myboat2 = new Boat("Harmony Blue","International 505",6467);
         myboat1.print();
         myboat2.print();

         myboat1.setName("Australia II");
         myboat1.print();
         System.out.println(myboat1.getName() + "\n" + myboat2.getName());
         myboat1.printTotal();*/

         // CP Task 4.2
        System.out.println("Starting boat application");
        Boat boat0 = new Boat();
        boat0.printTotal();
        Boat boat1 = new Boat("B1", "C", 1000, null);
        /*Boat boat2 = new Boat("B2", "C", 1001, boat1);*/
        Boat boat3 = new Boat("B3", "C", 1002, boat1);
        Boat boat4 = new Boat ("B4", "C", 1003, boat3);

        Boat currBoat = boat4;
        Boat prevBoat = null;

        while (currBoat != null) {
            currBoat.print();
            prevBoat = currBoat.getPreviousBoat();
            currBoat = prevBoat;
        }
        currBoat.printTotal();


    }
}
