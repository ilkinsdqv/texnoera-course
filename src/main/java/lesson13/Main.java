package lesson13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player ali =  new Player("Ali");
        Player aysel =  new Player("Aysel");
        Player kamran =  new Player("Kamran");

        Game FlappyBird = new Game("Flappy Bird", Difficulty.EASY, 100);
        Game SubwayRunner = new Game("Subway Runner", Difficulty.HARD, 200);
        Game PUBGMatch =  new Game("PUBG Match", Difficulty.MEDIUM, 250);

        ScoreSystem scoreSystem = new ScoreSystem(new Player[]{ali, aysel, kamran});

            scoreSystem.playGame(ali, FlappyBird);
            scoreSystem.playGame(aysel, SubwayRunner);
            scoreSystem.playGame(kamran, PUBGMatch);

            System.out.println("\nLeaderboard:");
            scoreSystem.showLeaderboard();

            Scanner scanner = new Scanner(System.in);

            System.out.print("\nEnter player id to find: ");
            int id = Integer.parseInt(scanner.nextLine());
            Player foundPlayer = scoreSystem.findPlayerById(id);
            if (foundPlayer != null) {
                foundPlayer.getInfo();
            } else {
                System.out.println("Player not found.");
            }
            scanner.close();
    }
}
