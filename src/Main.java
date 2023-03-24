
        import project.enam.Gender;
        import project.model.Group;
        import project.model.Student;
        import project.service.impl.GroupServiceImpl;
        import project.service.impl.StudentServiceImpl;

        public class Main {
    public static void main(String[] args) {


        Group group = new Group(24032023, "Java-9", "Backend", 2023);

        Student student = new Student(24032023, "Tolik", 23, Gender.MALE);

        GroupServiceImpl groupService = new GroupServiceImpl();
        StudentServiceImpl studentService = new StudentServiceImpl();

        groupService.addNewGroup(group);
        groupService.getAllGroups();




    }
}