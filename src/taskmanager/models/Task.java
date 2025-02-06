package taskmanager.models;

public class Task {
    private String name;
    private String description;
    private boolean done;
    private int priority;

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
        this.done = false;
    }

    public String getName() { return name; }
    public String getDescription() { return description; }
    public boolean isDone() { return done; }
    public void setDone() { this.done = true; }
    public int getPriority() { return priority; }

    @Override
    public String toString() {
        return "Task [name=" + name + ", description=" + description + ", done=" + done + "]";
    }
}
