package task;

public class Event extends Task {
    private String from;
    private String to;

    public Event(String desc, String from, String to) {
        super(desc);
        this.from = from;
        this.to = to;
    }

    public Event(String desc, boolean isDone, String from, String to) {
        super(desc, isDone);
        this.from = from;
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    @Override
    public String toString() {
        return "[E] " + super.toString() + " (from: " + from + ", to: " + to + ")";
    }
}