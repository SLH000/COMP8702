package practical08;

public class EventInformation {
    private String eventTime;
    private int eventDatum;

    EventInformation(String eventTime, int eventDatum){
        this.eventTime = eventTime;
        this.eventDatum = eventDatum;
    }
    public String getEventTime(){
        return eventTime;
    }
    public int getEventDatum(){
        return eventDatum;
    }
}
