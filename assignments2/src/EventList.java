import java.util.Arrays;
import java.util.PriorityQueue;

public class EventList {
    public static void main(String[] args) {
        PriorityQueue<Event> events = new PriorityQueue<>();

        events.add(new Event("ARRIVAL", 6));
        events.add(new Event("EXIT", 9));
        events.add(new Event("ARRIVAL", 7));
        events.add(new Event("EXIT", 4));

        Event nextEvent = events.poll();
        System.out.println("Removing event " + nextEvent.getKey() + " from the list (time: " + nextEvent.getValue() + ").");

        System.out.println();
        System.out.println("Printing event list:");

        Event[] eventArray = events.toArray(new Event[events.size()]);
        Arrays.sort(eventArray, events.comparator());
        for (Event e : eventArray) {
            System.out.println(e.getKey() + ", time: " + e.getValue());
        }
    }
}
