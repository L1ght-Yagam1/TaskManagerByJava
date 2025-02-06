package taskmanager.inputs;

import java.util.Scanner;

public class DescriptionStrategy implements DataStrategy {
    @Override
    public  String readData(Scanner scanner) {
        System.out.print("Введите описание задачи: ");
        return scanner.nextLine();
    }

    @Override
    public boolean validateData(String data) {
        if (data.isEmpty()) {
            System.out.println("Ошибка: описание не может быть пустым!");
            return false;
        }
        return true;
    }
}
