package practical08;

// A Recorder object can store up to 5 events
// The time of each event is stored as a string
// The constructor receives the coordinates of the recorder and the name
// of the event type as parameters

public class Recorder {
    int xPos, yPos;
    //Task 2
    // final int EVENT_MAX = 5;
    final int EVENT_MAX = 10; //Task 3
    String eventType, eventTime;
    //String[] event = new String[10];
    EventInformation [] event = new EventInformation[10];
    int xevent = 0;  // keeps track of how many events have occurred
    Recorder(int xPos, int yPos, String eventType) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.eventType = eventType;
    }
//Task 4
    public void recordEvent(String time, int datum) {
        event[xevent] = new EventInformation(time, datum);
        xevent++;
        if(xevent > EVENT_MAX){
            System.out.println("Event log overflow - terminating");
            System.exit(1);
            }
        }
        //Task 1-3
/*    public void recordEvent(String eventTime)  {
        if (xevent>=EVENT_MAX) {
            System.out.println("Event log overflow - terminating");
            System.exit(1);
        }else{
            event[xevent]=eventTime;
        xevent++;
        }
    }
    public void printEvents() {
        System.out.println("Record of " + eventType
                + " events at [" + xPos + "," + yPos + "]");
        // Task 1:
        // Add a for loop below this line to print out each event (see Task 1 spec)
        // Note that not all 5 elements of the array are necessarily used
        // The variable xevent is always one bigger than the index of the last
        // event recorded. For example, after two events have been recorded (as
        // in the main method above) the value of xevent will be 2

        for (int i=0; i<xevent; i++)
            System.out.println("Event number "+i+" was recorded at "+event[i]);
    }*/
    //Task 4
    public void printEvents() {
        System.out.println("Record of " + eventType
                + " events at [" + xPos + "," + yPos + "]");
        for (int i=0; i<xevent; i++)
            System.out.println("Event number " + i + " was recorded at " + event[i].getEventTime()
                    + " with datum = " + event[i].getEventDatum());
    }
}

