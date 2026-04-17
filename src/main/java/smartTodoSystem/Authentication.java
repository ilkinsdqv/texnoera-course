package smartTodoSystem;

import java.util.ArrayList;
import java.util.List;

public class Authentication {
    //Register
    //username + password daxil edilir
    //sistem user-i yadda saxlayır
    //3.2 Login
    //username + password yoxlanılır
    //düzgün olsa → user sistemə daxil olur
    //3.3 Session
    //sistemdə yalnız 1 user aktiv olur
    //currentUser session-u idarə edir
    //3.4 Logout
    //currentUser = null olur
    //user sistemdən çıxır

    private static List<User> users = new ArrayList<User>();
    public static User currentUser;

    public static void register(String username, String password) {
        User user = new User(username, password);
        users.add(user);
    }

    public static boolean login(String username, String password) {
        User user = findUserByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            System.out.println("Login successful for user: " + username);
            currentUser = user;
            return true;
        } else {
            System.out.println("Login failed for user: " + username);
            return false;
        }
    }

    public static void logout() {
        System.out.println("Logout successful for user: " + currentUser.getUsername());
        currentUser = null;
    }

    public static User findUserByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        System.out.println("User not found: " + username);
        return null;
    }

}
