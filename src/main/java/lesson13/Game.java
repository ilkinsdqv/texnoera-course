package lesson13;

public class Game {
    private final int id;
    private String name;
    private Difficulty difficulty;
    private int baseScore;
    private static int idCounter = 1;

    public Game(String name, Difficulty difficulty, int baseScore) {
        this.id = idCounter++;
        this.name = name;
        this.difficulty = difficulty;
        this.baseScore = baseScore;
    }

    public int calculateScore() {
        return switch (difficulty) {
            case MEDIUM -> baseScore * 2;
            case HARD -> baseScore * 3;
            default -> baseScore;
        };
    }

    public String getName() {
        return name;
    }
}
