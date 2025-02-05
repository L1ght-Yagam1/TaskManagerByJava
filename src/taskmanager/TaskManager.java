package taskmanager;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();

    public static TaskAction getAction(int choice) {
        return switch (choice) {
            case 2 -> new ListTasksStrategy();
            case 3 -> new CompleteTaskStrategy();
            case 4 -> new RemoveTaskStrategy();
            default -> null;
        };
    }
}
