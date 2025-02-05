package taskmanager;

import java.util.Scanner;

public class TaskUtils {
    public static int getTaskNumber(Scanner scanner) {
        System.out.print("Введите номер задачи: ");
        var index =  scanner.nextInt() - 1;
        scanner.nextLine();

        return index;
    }
}
