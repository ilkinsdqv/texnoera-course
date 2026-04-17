package smartTodoSystem;

import java.util.ArrayList;
import java.util.List;

public class User {
    //📦 Field-lər:
    //id → unikal istifadəçi nömrəsi
    //username → istifadəçi adı
    //password → giriş şifrəsi
    //List<Task> tasks → istifadəçinin task siyahısı
    //2.2 User Behaviour
    //register ola bilər
    //login ola bilər
    //logout edə bilər
    //yalnız öz task-larını idarə edir
    private final int id;
    private String username;
    private String password;
    private List<Task> tasks = new ArrayList<>();
    private static int idCounter = 0;
    public User(String username, String password) {
        this.id = idCounter++;
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTask(Task task){
        tasks.add(task);
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }
}
