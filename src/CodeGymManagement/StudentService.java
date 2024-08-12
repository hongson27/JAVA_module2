package CodeGymManagement;

import java.util.List;

public class StudentService implements IStudentService {
    private IStudentRepository iStudentRepository = new StudentRepository() {

        @Override
        public List<Student> findAll() {
            return iStudentRepository.findAll();
        }

        @Override
        public void add(Student student) {
            iStudentRepository.add(student);
        }
    };

}
