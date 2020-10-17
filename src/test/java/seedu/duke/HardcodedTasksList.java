package seedu.duke;

import seedu.duke.project.Project;
import seedu.duke.task.Task;

import java.util.ArrayList;

public class HardcodedTasksList {

    ArrayList<Task> tasks;

    public HardcodedTasksList(String taskOne, String taskTwo, String taskThree) {
        Task one = new Task(taskOne);
        Task two = new Task(taskTwo);
        Task three = new Task(taskThree);

        tasks.add(one);
        tasks.add(two);
        tasks.add(three);
    }

    public ArrayList<Task> getHardcodedTasksList() {
        return tasks;
    }

}
