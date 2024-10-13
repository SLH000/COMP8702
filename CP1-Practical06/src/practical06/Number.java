package practical06;

public class Number {

/*    public static void main(String[] args) {
        System.out.println("Starting Application...");
//        // Create a new Counter object and store a reference to it in
//        // the newly declared variable c:
       Counter c = new Counter(1);
//        // Invoke the method countUp from the object referred to by c
//        // with an actual parameter of 2
        c.countUp(2);
//        // Invoke the method countUp from the object referred to by c
//        // with an actual parameter of 3
        c.countUp(3);
        c.countDown(4);
        c.countUp(2);
        c.countDown(6);
        c.countUp(2);
        Counter c1 = new Counter(1);
        c1.countUp(5,3);
        Counter c2 = new Counter(5);
        c2.countUp(2);
    }*/
    public static void main (String[] args) {
        System.out.println("Starting Application...") ;
        Counter c = new Counter(1,3) ;
        c.countUp(5,'*') ;
        Counter c1 = new Counter(5) ;
        c1.countUp(2, '-');
        c1.countUp(2,'?') ;
    }
    }


