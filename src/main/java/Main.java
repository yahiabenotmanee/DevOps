
import group.Group;
import group.GroupName;
import group.GroupService;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {
//create a list of group
        List<Group> listGroups= createGroups();
        System.out.println("listGroups " );
        showGroup(listGroups);

    }
    private static List<Group> createGroups() {
        GroupName nameGroup[]={GroupName.MIAD, GroupName.MSIA, GroupName.MSIR};
        GroupService groupService = new GroupService();
        for (int i = 0; i < nameGroup.length; i++) {
            groupService.saveGroup(nameGroup[i]);
        }return groupService.allGroups();}
    
    private static void showGroup(List<Group> allGroups)
    { for (Group group:allGroups) {System.out.println(group.showGroup()); } }
    
}