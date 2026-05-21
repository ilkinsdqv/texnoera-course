package smartTodoSystem;


import org.json.JSONArray;
import org.json.JSONObject;
import smartTodoSystem.enums.Priority;
import smartTodoSystem.enums.Status;
import smartTodoSystem.exception.UsernameAlreadyExistsException;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        String username;
        String password;
        boolean login = false;
        while(choice != 10){
            System.out.println("1. Register\n2. Login\n3. Logout\n4. Add Task\n5. Task List\n6. Do task\n7. End task\n8. Update password\n9. Delete account\n10. Exit");
            choice = Integer.parseInt(input.nextLine());
            switch(choice){
                case 1:
                    System.out.println("Enter username:");
                    username = input.nextLine();
                    System.out.println("Enter password:");
                    password = input.nextLine();
                    try {
                        Authentication.register(username, password);
                    } catch (UsernameAlreadyExistsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    if(!login) {
                        System.out.println("Enter username:");
                        username = input.nextLine();
                        System.out.println("Enter password:");
                        password = input.nextLine();
                        try {
                            login = Authentication.login(username, password);
                        } catch (Exception e) {
                            login = false;
                            System.out.println(e.getMessage());
                        }
                    }else{
                        System.out.println("Already logged in. Please logout first.");
                    }
                    break;
                case 3:
                    if(login) {
                        Authentication.logout();
                        login = false;
                    }else{
                        System.out.println("No user is currently logged in.");
                    }
                    break;
                case 4:
                    if(login) {
                        System.out.println("Enter task title:");
                        String taskTitle = input.nextLine();
                        System.out.println("Enter task description:");
                        String taskDescription = input.nextLine();
                        int taskPriority;
                        while (true) {
                            System.out.println("Enter task priority: 1. LOW, 2. MEDIUM, 3. HIGH, 4. URGENT");
                            taskPriority = Integer.parseInt(input.nextLine());
                            if (taskPriority > 0 && taskPriority <= 4) {
                                break;
                            } else {
                                System.out.println("Invalid task priority.");
                            }
                        }
                        System.out.println("Enter task deadline by day:");
                        int taskDeadlineDay = Integer.parseInt(input.nextLine());
                        LocalDateTime currentDate = LocalDateTime.now();
                        LocalDateTime taskDeadline = currentDate.plusDays(taskDeadlineDay);
                        JSONArray tasks = Authentication.getTasks();
                        int maxId = 0;
                        for(int i = 0; i < tasks.length(); i++) {
                            int id = tasks.getJSONObject(i).getInt("id");
                            if(id > maxId) {
                                maxId = id;
                            }
                        }
                        int id = maxId + 1;
                        JSONObject taskObj = new JSONObject();
                        taskObj.put("id", id);
                        taskObj.put("title", taskTitle);
                        taskObj.put("description", taskDescription);
                        taskObj.put("priority", Priority.values()[taskPriority - 1].toString());
                        taskObj.put("deadline", taskDeadline);
                        taskObj.put("status", Status.values()[0].toString());
                        Authentication.currentUser.setTask(new Task(taskTitle, taskDescription, Priority.values()[taskPriority - 1], taskDeadline, id));
                        Authentication.currUserObj.getJSONArray("tasks").put(taskObj);
                        JSONArray allUsers = Authentication.getAllUsers();
                        for(int i = 0; i < allUsers.length(); i++) {
                            if(allUsers.getJSONObject(i).getString("username").equals(Authentication.currentUser.getUsername())) {
                                JSONArray taskArray = allUsers.getJSONObject(i).getJSONArray("tasks");
                                taskArray.put(taskObj);
                                break;
                            }
                        }

                        try (FileWriter file = new FileWriter(Authentication.file)) {
                            file.write(allUsers.toString(2));
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }else{
                        System.out.println("Please login to add a task.");
                    }
                    break;
                case 5:
                    if(login) {
                        JSONArray tasks = Authentication.getTasks();
                        if(tasks.length() == 0) {
                            System.out.println("No tasks found.");
                        }else {
                            for (int i = 0; i < tasks.length(); i++) {
                                JSONObject taskObj = tasks.getJSONObject(i);
                                System.out.println("Task ID: " + taskObj.getInt("id"));
                                System.out.println("Title: " + taskObj.getString("title"));
                                System.out.println("Description: " + taskObj.getString("description"));
                                System.out.println("Priority: " + taskObj.getString("priority"));
                                System.out.println("Deadline: " + taskObj.getString("deadline"));
                                System.out.println("Status: " + taskObj.getString("status"));
                                System.out.println("-------------");
                            }
                        }
                    }else{
                        System.out.println("Please login to view tasks.");
                    }
                    break;
                case 6:
                    if(login) {
                        System.out.println("Enter task title as mark doing");
                        String taskTitle = input.nextLine();
                        boolean found = false;
                        JSONArray allUsers = Authentication.getAllUsers();
                        for(int i = 0; i < allUsers.length(); i++) {
                            if(allUsers.getJSONObject(i).getString("username").equals(Authentication.currentUser.getUsername())) {
                                JSONArray taskArray = allUsers.getJSONObject(i).getJSONArray("tasks");
                                for(int j = 0; j < taskArray.length(); j++) {
                                    if(taskArray.getJSONObject(j).getString("title").equals(taskTitle)) {
                                        if(taskArray.getJSONObject(j).getString("status").equals(Status.IN_PROGRESS.toString())) {
                                            System.out.println("Task is already in progress: " + taskTitle);
                                        }else {
                                            taskArray.getJSONObject(j).put("status", Status.IN_PROGRESS.toString());
                                        }
                                        found = true;
                                        break;
                                    }
                                }
                                break;
                            }
                        }
                        try (FileWriter file = new FileWriter(Authentication.file)) {
                            file.write(allUsers.toString(2));
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        if(!found) {
                            System.out.println("Task not found: " + taskTitle);
                        }
                    }else{
                        System.out.println("Please login to add a task.");
                    }
                    break;
                case 7:
                    if(login) {
                        System.out.println("Enter task title as mark done");
                        String taskTitle = input.nextLine();
                        boolean found = false;
                        JSONArray allUsers = Authentication.getAllUsers();
                        for(int i = 0; i < allUsers.length(); i++) {
                            if(allUsers.getJSONObject(i).getString("username").equals(Authentication.currentUser.getUsername())) {
                                JSONArray taskArray = allUsers.getJSONObject(i).getJSONArray("tasks");
                                for(int j = 0; j < taskArray.length(); j++) {
                                    if(taskArray.getJSONObject(j).getString("title").equals(taskTitle)) {
                                        if(taskArray.getJSONObject(j).getString("status").equals(Status.DONE.toString())) {
                                            System.out.println("Task is already done: " + taskTitle);
                                        }else {
                                            taskArray.getJSONObject(j).put("status", Status.DONE.toString());
                                        }
                                        found = true;
                                        break;
                                    }
                                }
                                break;
                            }
                        }
                        try (FileWriter file = new FileWriter(Authentication.file)) {
                            file.write(allUsers.toString(2));
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        if(!found) {
                            System.out.println("Task not found: " + taskTitle);
                        }
                    }else{
                        System.out.println("Please login to add a task.");
                    }
                    break;
                case 8:
                    //update password
                    if(login) {
                        JSONArray users = Authentication.getAllUsers();
                        for (int i = 0; i < users.length(); i++) {
                            if (users.getJSONObject(i).getString("username").equals(Authentication.currentUser.getUsername())) {
                                System.out.println("Enter new password:");
                                String newPassword = input.nextLine();
                                users.getJSONObject(i).put("password", newPassword);
                                break;
                            }
                        }
                        try (FileWriter file = new FileWriter(Authentication.file)) {
                            file.write(users.toString(2));
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }else{
                        System.out.println("Please login to update password.");
                    }
                    break;
                case 9:
                    //delete account
                    if(login) {
                        JSONArray usersList = Authentication.getAllUsers();
                        for (int i = 0; i < usersList.length(); i++) {
                            if (usersList.getJSONObject(i).getString("username").equals(Authentication.currentUser.getUsername())) {
                                usersList.remove(i);
                                System.out.println("Account deleted successfully: " + Authentication.currentUser.getUsername());
                                Authentication.currentUser = null;
                                login = false;
                                break;
                            }
                        }
                        try (FileWriter file = new FileWriter(Authentication.file)) {
                            file.write(usersList.toString(2));
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }else{
                        System.out.println("Please login to delete account.");
                    }
                    break;
                case 10:
                    System.out.println("Exiting the application. Goodbye!");
                    input.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");

            }

        }
    }
}
