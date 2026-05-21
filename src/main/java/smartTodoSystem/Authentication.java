package smartTodoSystem;

import org.json.JSONArray;
import org.json.JSONObject;
import smartTodoSystem.exception.InvalidUsernameOrPasswordException;
import smartTodoSystem.exception.UserNotFoundException;
import smartTodoSystem.exception.UsernameAlreadyExistsException;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Authentication {

    public static User currentUser;
    static Path path = Paths.get("src/main/resources/users.json");
    static File file = new File(path.toString());
    static JSONObject currUserObj;

    public static JSONArray getTasks() {
        JSONArray users = getAllUsers();
        for (int i = 0; i < users.length(); i++) {
            if (users.getJSONObject(i).getString("username").equals(currentUser.getUsername())) {
                return users.getJSONObject(i).getJSONArray("tasks");
            }
        }
        return new JSONArray();
    }

    public static JSONArray getAllUsers(){
        JSONArray users;
        if(file.exists()) {
            try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
                StringBuilder sb = new StringBuilder();
                String line;
                while((line = reader.readLine()) != null) {
                    sb.append(line);
                }
                users = new JSONArray(sb.toString());
            }catch (Exception e){
                users = new JSONArray();
            }
        }else{
            users = new JSONArray();
        }
        return users;
    }

    public static void register(String username, String password) throws UsernameAlreadyExistsException {
        JSONArray users = getAllUsers();
        int maxId = 0;
        for(int i = 0; i < users.length(); i++) {
            int id = users.getJSONObject(i).getInt("id");
            String userName = users.getJSONObject(i).getString("username");
            if(userName.equals(username)) {
                throw new UsernameAlreadyExistsException(username);
            }
            if(id > maxId) {
                maxId = id;
            }
        }
        int newId = maxId + 1;

        JSONObject newUser = new JSONObject();
        newUser.put("id", newId);
        newUser.put("username", username);
        newUser.put("password", password);
        newUser.put("tasks", new JSONArray());
        users.put(newUser);

        try(FileWriter writer = new FileWriter(file)) {
            writer.write(users.toString(2));
            System.out.println("User registered successfully: " + username);
        }catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public static boolean login(String username, String password) throws UserNotFoundException {
        JSONObject user = findUserByUsername(username);
        if(user == null) {
            throw new UserNotFoundException(username);
        }
        if (user.getString("password").equals(password)) {
            System.out.println("Login successful for user: " + username);
            currentUser = new User(user.getString("username"), user.getString("password"), user.getInt("id"));
            currUserObj = new JSONObject();
            currUserObj.put("id", currentUser.getId());
            currUserObj.put("username", currentUser.getUsername());
            currUserObj.put("tasks", getTasks());
            currUserObj.put("password", currentUser.getPassword());
            return true;
        } else{
            throw new InvalidUsernameOrPasswordException();
        }
    }

    public static void logout() {
        System.out.println("Logout successful for user: " + currentUser.getUsername());
        currentUser = null;
    }

    public static JSONObject findUserByUsername(String username){
        JSONArray users = getAllUsers();
        for (int i = 0; i < users.length(); i++) {
            if(users.getJSONObject(i).getString("username").equals(username)) {
                return users.getJSONObject(i);
            }
        }
        return null;
    }

}
