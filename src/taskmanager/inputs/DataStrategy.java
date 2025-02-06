package taskmanager.inputs;

import java.util.Scanner;

public interface DataStrategy {
    String readData(Scanner scanner);
    boolean validateData(String data);
}
