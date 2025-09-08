public class Event implements Comparable<Event> {


    @Override
    public int compareTo(Event other) {
        return this.getValue().compareTo(other.getValue());
    }
}
