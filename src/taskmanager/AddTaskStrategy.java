package taskmanager;

import java.util.List;
import java.util.Scanner;


public class AddTaskStrategy implements TaskAction {
    private final DataStrategy titleStrategy = new TitleStrategy();
    private final DataStrategy descriptionStrategy = new DescriptionStrategy();

    @Override
    public void execute(List<Task> tasks, Scanner scanner) {
        String title = titleStrategy.readData(scanner);
        var validatedTitle = titleStrategy.validateData(title);



        String description = descriptionStrategy.readData(scanner);
        var validatedDescription = descriptionStrategy.validateData(description);

        if (validatedDescription && validatedTitle) {
            tasks.add(new Task(title, description));
        }
    }
}
