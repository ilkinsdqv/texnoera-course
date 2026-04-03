package l07.oop.fundamental.homework.task09HardCourseEnrollmentSystem;

public class Main {
    public static void main(String[] args) {
        Course javaCourse = new Course("Java 101", 2);

        Student s1 = new Student(101, "Alice");
        Student s2 = new Student(102, "Bob");
        Student s3 = new Student(103, "Charlie");

        javaCourse.enroll(s1);
        javaCourse.enroll(s2);
        javaCourse.enroll(s3);

        javaCourse.printEnrolledStudents();
    }
}
