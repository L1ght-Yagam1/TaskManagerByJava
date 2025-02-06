package taskmanager.actions;  // Пакет, соответствующий структуре файлов

import taskmanager.models.Task;

import java.util.List;
import java.util.Scanner;

public interface TaskAction {
    void execute(List<Task> tasks, Scanner scanner);
}
