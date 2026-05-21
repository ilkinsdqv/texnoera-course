package smartTodoSystem;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private int id;
    private String username;
    private String password;
    private List<Task> tasks = new ArrayList<>();
    public User(String username, String password, int id) {
        this.id = id;
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
