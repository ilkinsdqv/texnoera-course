package l07.oop.fundamental.homework.task09HardCourseEnrollmentSystem;

public class Course {
    private String name;
    private int capacity;
    private Student[] enrolled;


    public Course(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.enrolled = new Student[capacity];
    }

    public boolean enroll(Student student) {
        for (int i = 0; i < enrolled.length; i++) {
            if(enrolled[i] == null) {
                enrolled[i] = student;
                return true;
            }
        }
        System.out.println("Capacity is full");
        return false;
    }

    public void printEnrolledStudents() {
        for(Student s: enrolled) {
            System.out.println(s.toString());
        }
    }
}
