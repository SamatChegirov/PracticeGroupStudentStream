package project.service.impl;

import com.sun.source.tree.NewArrayTree;
import project.db.Database;
import project.model.Group;
import project.service.GroupService;

import java.util.Comparator;
import java.util.List;

public class GroupServiceImpl implements GroupService {
    Database database = new Database();

    @Override
    public String addNewGroup(Group group) {
        database.getGroups().add(group);
        return "Successfully";
    }

    @Override
    public String getGroupById(int id) {
        database.getGroups().stream().sorted().forEach(System.out::println);
        return null;
    }

    @Override
    public List<Group> getAllGroups() {
        database.getGroups().stream().sorted().forEach(System.out::println);
        return null;
    }

    @Override
    public String updateGroupName(int id, String groupName) {

        return null;
    }

    @Override
    public List<Group> filterByYear(int year, String ascDesc) {
        return null;
    }

    @Override
    public List<Group> sortGroupByYear(String ascDesc) {
        return null;
    }

    @Override
    public void deleteGroupById(int id) {

    }
}
