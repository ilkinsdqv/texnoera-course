package l07.oop.fundamental.homework.task11HardClassroomReport;

public class Student {
    public String name;
    public int[] scores;

    public Student(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }

    public int averageScore() {
        int sum = 0;
        for(int score: scores) {
            sum += score;
        }
        return sum/scores.length;
    }
}
