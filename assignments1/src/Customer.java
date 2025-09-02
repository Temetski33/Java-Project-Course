public class Customer {
    private int id;
    private long startTime;
    private long endTime;
    private long timeSpent;

    private static int newId = 1;

    public Customer() {
        this.id = newId++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getTimeSpent() {
        this.timeSpent = endTime - startTime;

        return timeSpent;
    }
}
