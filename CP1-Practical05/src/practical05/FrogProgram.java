package practical05;
public class FrogProgram {
    public static void main(String[] args) {
//Task 1
        /*        Frog myFrog = new Frog();  // create a Frog object
        myFrog.name = "Fred";      //###
        myFrog.age = 22;
        myFrog.print();
       System.out.print("Age group is " + myFrog.printAgeGroup());*/
//Task 2
        Frog myFrog1 = new Frog("Fred", 22, 1000);
        Frog myFrog2 = new Frog("Fran", 75, 1001);
        myFrog1.print();
        System.out.println(myFrog1.printAgeGroup());
        myFrog2.print();
        System.out.println(myFrog2.printAgeGroup());
//Task 3
        System.out.println(myFrog1.reverseName());
        System.out.println(myFrog2.reverseName());
        System.out.println("Frog's name is " + myFrog1.getName());
        System.out.println("Frog's name is " + myFrog2.getName());
//Task 4
        Frog f = myFrog1.greaterAge(myFrog2);
        f.print();

    }
}

