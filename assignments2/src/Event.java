public class Event implements Comparable<Event> {
    private EventType key;
    private int value;

    public enum EventType {
        ARRIVAL,
        EXIT
    }

    public Event(EventType key, int value) {
        this.key = key;
        this.value = value;
    }

    public EventType getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int compareTo(Event other) {
        return Integer.compare(this.getValue(), other.getValue());
    }

}
