package taskmanager;

import java.util.List;
import java.util.Scanner;


public class AddTaskStrategy implements TaskAction {
    @Override
    public void execute(List<Task> tasks, Scanner scanner) {
        var title = scanner.nextLine();
        var description = scanner.nextLine();

        tasks.add(new Task(title, description));
    }
}
