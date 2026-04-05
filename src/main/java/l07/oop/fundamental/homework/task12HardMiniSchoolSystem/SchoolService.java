package l07.oop.fundamental.homework.task12HardMiniSchoolSystem;

import java.util.ArrayList;
import java.util.List;

public class SchoolService {
    private static List<Teacher> teachers = new ArrayList<>();
    private static List<Student> students = new ArrayList<>();


    public void addStudent(Student student) {
        students.add(student);
        System.out.println(student.getName() + " added");
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
        System.out.println(teacher.getName() + " added");
    }

    public List<Student> getStudents() {
        return students;
    }
    public List<Teacher> getTeachers() {
        return teachers;
    }
}
