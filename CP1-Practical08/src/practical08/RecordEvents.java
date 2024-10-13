package practical08;

// Program to record the times at which events occur at a number of
// locations. No continuity or error checking is performed.

//RecordEvents creates a single recorder, records 2 events
// and prints out the complete list of events
public class RecordEvents {

    public static void main(String args[]) {

        //Task 1
/*        Recorder r1 = new Recorder(100, 100, "Wombat Detection");
        r1.recordEvent("10:53");
        r1.recordEvent("10:59");
        r1.printEvents();*/

        //Task 2
/*        EventInformation e = new EventInformation("10:53",45); //Task 3
        System.out.println("Event recorded at " + e.getEventTime() +
                ", datum = " + e.getEventDatum());
        Recorder r1 = new Recorder(100, 100, "Wombat Detection");
        r1.recordEvent("10:53");
        r1.recordEvent("10:59");
        r1.recordEvent("11:05");
        r1.recordEvent("12:59");
        r1.recordEvent("13:59");
        r1.recordEvent("14:06");
        r1.printEvents();*/

        //Task 4
        Recorder r1 = new Recorder(100, 100, "Wombat Detection");
        r1.recordEvent("10:53", 20);
        r1.recordEvent("10:59", 20);
        r1.recordEvent("11:05", 20);
        r1.recordEvent("12:59", 10);
        r1.recordEvent("13:59", 10);
        r1.recordEvent("14:06", 10);
        r1.printEvents();
    }
}

