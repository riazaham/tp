package seedu.duke.member;

import java.util.ArrayList;

public class TeamMemberList {
    protected static ArrayList<TeamMember> memberList = new ArrayList<>();

    public TeamMemberList() {

    }

    public static void addTeamMember(String name) {
        TeamMember newMember = new TeamMember(name);
        memberList.add(newMember);
    }

    public static void removeTeamMember(String name) {
        memberList.removeIf(member -> (member.name.contains(name)));
    }

    public static String listTeamMembers() {
        if (memberList.size() == 0) {
            return "No team members have been added.";
        }
        
        String listOfMembers = "";
        int i = 0;
        for (TeamMember member : memberList) {
            String memberLine = (i + 1) + ". " + member.name + "\n";
            listOfMembers += memberLine;
            i++;
        }

        return listOfMembers;
    }
}
