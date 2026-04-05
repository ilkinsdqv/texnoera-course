package l07.oop.fundamental.homework.task11HardClassroomReport;

public class Classroom {
    public Student[] students;

    public Classroom(Student[] students) {
        this.students = students;
    }

    public Student maxScore() {
        Student st = null;
        int max = 0;
        for (Student student : students) {
            if(max < student.averageScore()) {
                max = student.averageScore();
                st = student;
            }
        }
        return st;
    }
}
