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

    public void setStartTime() {
        this.startTime = System.currentTimeMillis();
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime() {
        this.endTime = System.currentTimeMillis();
    }

    public long getTimeSpent() {
        this.timeSpent = endTime - startTime;

        return timeSpent;
    }
}
