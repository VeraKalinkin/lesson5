import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TeacherController teacherController = new TeacherController();
        teacherController.create("Abr", "Hnm", "Jkl");
        teacherController.teachers.getLast().setTeacherRate(0.5);
        teacherController.create("Rtv", "Svb", "Fdr");
        teacherController.teachers.getLast().setTeacherRate(1.5);

        teacherController.printTeacherList();

        User user = new User("Aa", "Bb", "Cc");
        Teacher teacher = new Teacher(5, 1.0, "Nn", "Mm", "Ll");

        System.out.println(user.getName());
        System.out.println(user);

        System.out.println(teacher.getName());
        System.out.println(teacher);
        //принцип подстановки Барбары Лисков (??)

        //teacherController.change(teacherController.teachers.get(1));
        //teacherController.printTeacherList();

        }
}