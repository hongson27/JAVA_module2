package CodeGymManagement;

import java.util.List;


public interface IStudentRepository {
    List<Student> findAll();
    void add(Student student);
}
