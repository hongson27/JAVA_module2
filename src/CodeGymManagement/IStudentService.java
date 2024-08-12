package CodeGymManagement;

import java.util.List;

public interface IStudentService  {
    void add(Student student);
    List<Student> findAll();
}
