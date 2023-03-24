        /*1) Жаны проект тузунуз.
2) 3 жаны пакет тузунуз - model, service, db.
3) model пакеттин ичине Group, Student деген класс тузунуз,Group свойствалары - int id, String name, String description, int year.
 Student fullName, int age, Gender, Genderди enum кылып башка пакетке тузуп койсонуз болот.
4) db пакет тузунуз, пакеттин ичине Database деген класс тузунуз,
ичинде 2 свойствасы болот - groups, students. Бул класс биздин база
данных болот.
5) service пакеттин ичине GroupService деген жана StudentService тузунуз,  жана
 impl деген пакет тузуп коюнуз.  impl пакеттин ичине GroupServiceImpl, StudentServiceImpl деген класстарды
тузунуз, GroupServiceImpl бул класс GroupService  интерфейсин ишке ашырат,
StudentServiceImpl бул класс GroupService  интерфейсин ишке ашырат жана бул
 класстарда свойства катары биздин база данныхыбыз болот(Database).

6) GroupService

    String addNewGroup(Group group);

    // with stream
    String getGroupById(int id);

    //with stream
    List<Group> getAllGroups();

    //with stream
    String updateGroupName(int id, String groupName);

    //with stream (asc ди басканда ascending, desc ди басканда descending кылып сорттосун)
    List<Group>filterByYear(int year, String ascDesc);

    //with stream  (asc ди басканда ascending, desc ди басканда descending кылып сорттосун)
    List<Group>sortGroupByYear(String ascDesc);

    //with stream
    void deleteGroupById(int id);


7) StudentService
    String addStudent(Student student);

    Student getStudentById(int id);

    List<Student> getAllStudents();

    String updateStudentFullName(int id, String fullName);

    //with stream (1 ди басканда female, 2 ни басканда male кылып фильтрлесин)
    List<Student> filterByGender();

    void deleteStudentById(int id);*/

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