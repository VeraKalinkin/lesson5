import java.util.List;

public class UserView<T extends User> { // принцип единственной ответственности - класс отвечает только за вывод данных
    void sendOnConsole(List<T> users){
        for (T user : users)
            System.out.println(user);
    }
}
