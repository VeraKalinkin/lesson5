import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherController implements UserController<Teacher>{
    // принцип единственной ответственности - класс отвечает за добавление и изменение Teacher

    List<Teacher> teachers = new ArrayList<>();

    UserView<Teacher> teacherUserView = new UserView<Teacher>();

    @Override
    public void create(String firstName,String secondName, String lastName) {

        int maxId = 0;
        if (!teachers.isEmpty())
            maxId = teachers.get(teachers.size() - 1).getTeacherIdtId() + 1;

        double defaultRate = 0.0;
        Teacher teacher = new Teacher(maxId, defaultRate, firstName, secondName, lastName);
        teachers.add(teacher);
    }
// принцип открытости-закрытости - можно добавить новые параметры, нельзя менять метод из UserController

    public void change(Teacher teacher){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Изменить фамилию - 1 '\n' Изменить имя - 2 '\n' Изменить отчество - 3");
        int operation = scanner.nextInt();
        System.out.println("Введите новые данные: ");
        String newName = scanner.next();
        scanner.close();
        switch (operation){
            case(1):
                teacher.setFirstName(newName);
                break;
            case(2):
                teacher.setSecondName(newName);
                break;
            case(3):
                teacher.setName(newName);
        }
    }

    void printTeacherList(){
        // принцип инверсии зависимостей (??) UserView как абстракция
        teacherUserView.sendOnConsole(teachers);
    }
}
