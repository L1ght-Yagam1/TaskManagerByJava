package taskmanager;

import java.util.List;
import java.util.Scanner;

public class ListTasksStrategy implements TaskAction {
    @Override
    public void execute(List<Task> tasks, Scanner scanner) {
        if (tasks.isEmpty()) {
            System.out.println("Нет задач.");
            return;
        }
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }
}
