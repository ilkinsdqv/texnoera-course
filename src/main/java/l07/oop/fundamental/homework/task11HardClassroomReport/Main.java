package l07.oop.fundamental.homework.task11HardClassroomReport;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] scoresIlkin = {100,80,60};
        int[] scoresElxan = {100,80,90};
        int[] scoresAli = {90,80,90};
        Student[] students = {
            new Student("Ilkin", scoresIlkin),
            new Student("Elxan", scoresElxan),
            new Student("Ali", scoresAli)
        };
        Classroom classRoom =  new Classroom(students);

        System.out.println("Averages: ");
        System.out.println();
        for (Student student : students) {
            System.out.print(student.name + "scores: ");
            System.out.print(Arrays.toString(student.scores) + " -> average: " + student.averageScore());
            System.out.println();
        }
        Student topStudent = classRoom.maxScore();
        System.out.println("Top Student: " + topStudent.name + " -> average: " + topStudent.averageScore());
    }
 }
