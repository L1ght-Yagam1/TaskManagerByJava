package taskmanager;

import java.util.List;
import java.util.Scanner;

import static taskmanager.TaskUtils.getTaskNumber;

public class RemoveTaskStrategy implements TaskAction {
    @Override
    public void execute(List<Task> tasks, Scanner scanner) {
        int index = getTaskNumber(scanner);
        tasks.remove(index);
    }
}
