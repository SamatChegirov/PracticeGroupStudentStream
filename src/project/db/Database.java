package project.db;

import project.model.Group;
import project.model.Student;

import java.util.ArrayList;
import java.util.List;

public class Database {
    List<Group> groups = new ArrayList<>();
    List<Student> students = new ArrayList<>();

    public Database() {
    }

    public Database(List<Group> groups, List<Student> students) {
        this.groups = groups;
        this.students = students;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Database{" +
                "groups=" + groups +
                ", students=" + students +
                '}';
    }
}
