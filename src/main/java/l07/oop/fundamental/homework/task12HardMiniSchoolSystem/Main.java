package l07.oop.fundamental.homework.task12HardMiniSchoolSystem;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SchoolService schoolService = new SchoolService();
        Scanner input = new Scanner(System.in);
        int choice = -1;
        while(choice != 0) {
            System.out.println("Make choice: ");
            System.out.println("1. Add Student");
            System.out.println("2. Add Teacher");
            System.out.println("3. List all People");
            System.out.println("0. Exit");
            choice = Integer.parseInt(input.nextLine());
            switch(choice){
                case 1:
                    Student student = new Student();
                    System.out.println("Enter Student Name: ");
                    String studentName = input.nextLine();
                    student.setName(studentName);
                    schoolService.addStudent(student);
                    break;
                case 2:
                    Teacher teacher = new Teacher();
                    System.out.println("Enter Teacher Name: ");
                    String teacherName = input.nextLine();
                    teacher.setName(teacherName);
                    schoolService.addTeacher(teacher);
                    break;
                case 3:
                    List<Teacher> teachers = schoolService.getTeachers();
                    List<Student> students = schoolService.getStudents();
                    System.out.println("Teacher List: ");
                    for(Teacher t: teachers){
                        System.out.println(t.getName());
                    }
                    System.out.println();
                    System.out.println("Student List: ");
                    for(Student s: students){
                        System.out.println(s.getName());
                    }
                    break;
                case 0:
                    System.out.println("Good bye!");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }

        }
        input.close();
    }
}
