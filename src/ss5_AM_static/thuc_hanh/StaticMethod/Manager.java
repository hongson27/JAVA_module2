package ss5_AM_static.thuc_hanh.StaticMethod;

public class Manager {
        public static void main(String[] args) {
            Student.change();
            Student student = new Student("Sơn", 26);
            Student student2 = new Student("Thúy", 26);
            Student student3 = new Student("Sơn Thúys", 26);
            student.display();
            student2.display();
            student3.display();
        }
}