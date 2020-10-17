package seedu.duke.commands.task;

import org.junit.jupiter.api.Test;
import seedu.duke.HardcodedProjectsList;
import seedu.duke.HardcodedTasksList;
import seedu.duke.project.Project;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TaskSelectCommandTest {

    //naming convention - methodUnderTest_inputGiven_expectedOutput

    HardcodedProjectsList projects = new HardcodedProjectsList("CS2113T", "CG2271", "EE2026");
    HardcodedTasksList tasks = new HardcodedTasksList("UG", "DG", "Testing");

    @Test
    void executeCommand_index_returnsTaskObject() {
        projects.assignTasks(1, tasks);
        ArrayList<Project> projectsList = projects.getHardcodedProjectsList();
        TaskSelectCommand command = new TaskSelectCommand(1,1);
        //assertEquals("UG", command.executeCommand(projectsList)); => Need to simplify OOP => remove ProjectList
    }
}