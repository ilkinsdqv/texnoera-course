package smartTodoSystem;


import smartTodoSystem.enums.Priority;
import smartTodoSystem.enums.Status;

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
        while(choice != 8){
            System.out.println("1. Register\n2. Login\n3. Logout\n4. Add Task\n5. Task List\n6. Do task\n7. End task\n8. Exit");
            choice = Integer.parseInt(input.nextLine());
            switch(choice){
                case 1:
                    System.out.println("Enter username:");
                    username = input.nextLine();
                    System.out.println("Enter password:");
                    password = input.nextLine();
                    Authentication.register(username, password);
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
                        Task task = new Task(taskTitle, taskDescription, Priority.values()[taskPriority - 1], taskDeadline);
                        Authentication.currentUser.setTask(task);
                    }else{
                        System.out.println("Please login to add a task.");
                    }
                    break;
                case 5:
                    if(login) {
                        Authentication.currentUser.getTasks().stream().forEach(System.out::println);
                    }else{
                        System.out.println("Please login to view tasks.");
                    }
                    break;
                case 6:
                    if(login) {
                        System.out.println("Enter task title as mark doing");
                        String taskTitle = input.nextLine();
                        List<Task> list =  Authentication.currentUser.getTasks();
                        boolean found = false;
                        for(Task task : list){
                            if(taskTitle.equals(task.getTitle())){
                                task.setStatus(Status.IN_PROGRESS);
                                found = true;
                                break;
                            }
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
                        for(Task task : Authentication.currentUser.getTasks()){
                            if(taskTitle.equals(task.getTitle())){
                                task.setStatus(Status.DONE);
                                break;
                            }
                        }
                        System.out.println("Task not found: " +  taskTitle);
                    }else{
                        System.out.println("Please login to add a task.");
                    }
                    break;
                case 8:
                    System.out.println("Exiting the application. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");

            }

        }
    }
}
