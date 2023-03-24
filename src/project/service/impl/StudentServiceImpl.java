package project.service.impl;

import project.db.Database;
import project.model.Student;
import project.service.StudentService;

import java.util.Date;
import java.util.List;

public class StudentServiceImpl implements StudentService {

    Database database = new Database();

    @Override
    public String addStudent(Student student) {
        database.getStudents().add(student);
        return null;
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
        return null;
    }

    @Override
    public String updateStudentFullName(int id, String fullName) {
        return null;
    }

    @Override
    public List<Student> filterByGender() {
        return null;
    }

    @Override
    public void deleteStudentById(int id) {

    }
}
