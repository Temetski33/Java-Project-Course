import java.util.PriorityQueue;

public class EventList {
    public static void main(String[] args) {
        PriorityQueue<Event> events = new PriorityQueue<>();

        events.add(new Event("A1", 6));
        events.add(new Event("A2", 9));
        events.add(new Event("A3", 7));
        events.add(new Event("A4", 4));

        System.out.println(events);

        while (!events.isEmpty()) {
            Event firstInLine = events.poll();
            System.out.println(firstInLine.getKey() + " " + firstInLine.getValue());
        }
    }
}
