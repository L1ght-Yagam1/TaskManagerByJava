package taskmanager;  // Пакет, соответствующий структуре файлов

import java.util.List;
import java.util.Scanner;

public interface TaskAction {
    void execute(List<Task> tasks, Scanner scanner);
}
