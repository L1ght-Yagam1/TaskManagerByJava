package taskmanager;

import java.util.Scanner;

public class TitleStrategy implements DataStrategy {
    @Override
    public  String readData(Scanner scanner) {
        System.out.print("Введите название задачи: ");
        return scanner.nextLine();
    }

    @Override
    public boolean validateData(String data) {
        if (data.length() < 3) {
            System.out.println("Ошибка: название должно быть не менее 3 символов.");
            return false;
        }
        return true;
    }
}
