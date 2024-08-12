package CodeGymManagement;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private final static List<Student> list;

    static {
        list = new ArrayList<>();
        Student s1 = new Student("1", "270699", "Hồng Sơn", LocalDate.parse("27-06-1999"),
                "dohongson27@gmail.com", "Partime");
        Student s2 = new Student("2", "140496", "Ngọc Thúy", LocalDate.parse("14-04-1996"),
                "ngocthuytnt@gmail.com", "Partime");
        list.add(s1);
        list.add(s2);
    }


    @Override
    public List<Student> findAll() { return list;}

    @Override
    public void add(Student student) {
        list.add(student);
    }
}
