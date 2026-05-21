package smartTodoSystem;

import org.json.JSONArray;
import org.json.JSONObject;

public class UserJsonConverter {
    public static JSONObject toJson(User user) {
        JSONObject obj = new JSONObject();
        obj.put("id", user.getId());
        obj.put("username", user.getUsername());
        obj.put("password", user.getPassword());

        JSONArray tasksArray = new JSONArray();
        for (Task task : user.getTasks()) {
            JSONObject taskObj = new JSONObject();
            taskObj.put("id", task.getId());
            taskObj.put("title", task.getTitle());
            taskObj.put("description", task.getDescription());
            taskObj.put("status", task.getStatus().toString());
            taskObj.put("priority", task.getPriority().toString());
            taskObj.put("deadline", task.getDeadline().toString());
            tasksArray.put(taskObj);
        }
        obj.put("tasks", tasksArray);

        return obj;
    }
}
