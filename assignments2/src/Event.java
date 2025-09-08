public class Event implements Comparable<Event> {
    private String key;
    private int value;

    public Event(String key, int value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
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
