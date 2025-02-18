package taskmanager.actions;

import taskmanager.models.Task;

import java.util.List;
import java.util.Scanner;

import static taskmanager.utils.TaskUtils.getTaskNumber;

public class CompleteTaskStrategy implements TaskAction {
    @Override
    public void execute(List<Task> tasks, Scanner scanner) {
        int index = getTaskNumber(scanner);
        Task task = tasks.get(index);
        task.setDone();
    }
}
