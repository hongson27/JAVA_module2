package ss5_AM_static.thuc_hanh.StaticMethod;

public class Student {
    private String name;
    private int age;
    private static String college = "Codegym";
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    static void change() {
        college = "Coder";
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("College: " + college);
    }
}

