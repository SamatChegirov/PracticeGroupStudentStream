package project.service;

import project.model.Group;

import java.util.List;

public interface GroupService {
    String addNewGroup(Group group);

    String getGroupById(int id);

    List<Group> getAllGroups();

    String updateGroupName(int id, String groupName);

    List<Group> filterByYear(int year, String ascDesc);

    List<Group> sortGroupByYear(String ascDesc);

    void deleteGroupById(int id);
}
