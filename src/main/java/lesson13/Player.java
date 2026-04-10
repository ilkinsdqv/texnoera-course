package lesson13;

public class Player {
    private final int id;
    private String name;
    private int totalScore;
    private static int idCounter = 1;

    public Player(String name) {
        this.name = name;
        this.totalScore = 0;
        this.id = idCounter++;
    }
    public int getId() {return id;}

    public String getName() {
        return name;
    }

    public int getTotalScore() {return totalScore;}

    public int addScore(int score) {
        return totalScore += score;
    }

    public void getInfo(){
        System.out.printf("Name: %s - %d%n", name, totalScore);
    }
}
