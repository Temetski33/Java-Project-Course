import java.util.Arrays;
import java.util.PriorityQueue;

public class EventList {
    public static void main(String[] args) {
        PriorityQueue<Event> events = new PriorityQueue<>();

        events.add(new Event("A1", 6));
        events.add(new Event("A2", 9));
        events.add(new Event("A3", 7));
        events.add(new Event("A4", 4));

        Event nextEvent = events.poll();
        System.out.println("Removing event " + nextEvent.getKey() + " from the list.");

        System.out.println();
        System.out.println("Printing event list:");

        Event[] eventArray = events.toArray(new Event[events.size()]);
        Arrays.sort(eventArray, events.comparator());
        for (Event e : eventArray) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
