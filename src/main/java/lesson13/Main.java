package lesson13;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player ali =  new Player("Ali");
        Player aysel =  new Player("Aysel");
        Player kamran =  new Player("Kamran");


        Game FlappyBird = new Game("Flappy Bird", Difficulty.EASY, 100);
        Game SubwayRunner = new Game("Subway Runner", Difficulty.HARD, 200);
        Game PUBGMatch =  new Game("PUBG Match", Difficulty.MEDIUM, 250);
        Game[] games = {FlappyBird, SubwayRunner, PUBGMatch};
        Random rand = new Random();

        ScoreSystem scoreSystem = new ScoreSystem(new Player[]{ali, aysel, kamran});
        scoreSystem.addPlayer(new Player("Kuru"));
        scoreSystem.addPlayer(new Player("Efek"));
        scoreSystem.addPlayer(new Player("Saran"));
        scoreSystem.addPlayer(new Player("Sefan"));
        scoreSystem.addPlayer(new Player("Elxam"));
        scoreSystem.addPlayer(new Player("Sara"));
        scoreSystem.addPlayer(new Player("Kumar"));


        for (int i = 0; i < scoreSystem.players.length; i++) {
            if(scoreSystem.players[i] == null) {
                break;
            }
            scoreSystem.playGame(scoreSystem.players[i], games[rand.nextInt(games.length)]);
        }


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
