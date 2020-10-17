package seedu.duke.commands.member;

import seedu.duke.commands.Command;
import seedu.duke.project.ProjectList;
import seedu.duke.member.TeamMemberList;
import seedu.duke.ui.Ui;

public class AddTeamMemberCommand extends Command {

    private String name;

    public AddTeamMemberCommand(String name) {
        this.name = name;
    }

    public String executeCommand(ProjectList projects) {
        TeamMemberList.addTeamMember(name);
        return Ui.printMemberAddedMessage(name);
    }

    public Boolean isExit() {
        return false;
    }
}
