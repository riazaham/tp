package seedu.duke;

import seedu.duke.project.Project;
import seedu.duke.task.Task;

import java.util.ArrayList;

public class HardcodedProjectsList {

    ArrayList<Project> projects;

    public HardcodedProjectsList(String projectOne, String projectTwo, String projectThree) {
        Project one = new Project(projectOne);
        Project two = new Project(projectTwo);
        Project three = new Project(projectThree);

        projects.add(one);
        projects.add(two);
        projects.add(three);
    }

    public Project selectProject(int index) {
        return projects.get(index);
    }

    public void assignTasks(int index, HardcodedTasksList tasks) {
        Project project = selectProject(index);
        for (Task task : tasks.getHardcodedTasksList()) {
            project.createTask(task.getDescription());
        }
    }

    public ArrayList<Project> getHardcodedProjectsList() {
        return projects;
    }

}
