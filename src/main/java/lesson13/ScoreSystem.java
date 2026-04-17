package lesson13;

import java.util.Arrays;

public class ScoreSystem {
    Player[] players =  new Player[10];
    int indexCounter = 0;
    public ScoreSystem(Player[] players) {
        this.players = players;
    }

    public void addPlayer(Player player) {
        for (int i = 0; i < players.length; i++) {
            if(players[i] != null){
                indexCounter++;
                if(indexCounter == (int)(players.length * 0.8)) {
                    Player[] temp = players.clone();
                    players = new Player[players.length + 5];
                    System.arraycopy(temp, 0, players, 0, temp.length);
                }
            }else{
                players[i] = player;
                indexCounter = 0;
                break;
            }
        }
    }

    public void playGame(Player player, Game game) {
        int score = player.addScore(game.calculateScore());
        System.out.println(player.getName() + " played " + game.getName() + " and got " + score + " points");
    }

    public void showLeaderboard(){
        Player[] temp = players.clone();
        boolean swapped = false;
        do{
            for(int i = 0; i < temp.length-1; i++){
                if(temp[i] == null) {
                    break;
                }else {
                    if (temp[i].getTotalScore() < temp[i + 1].getTotalScore()) {
                        Player t = temp[i];
                        temp[i] = temp[i + 1];
                        temp[i + 1] = t;
                        swapped = true;
                    }
                }
            }
        }while(!swapped);
        for (Player player : temp) {
            player.getInfo();
        }
    }

    public Player findPlayerById(int id){
        for (int i = 0; i < players.length; i++) {
            if(players[i].getId() == id) return players[i];
        }
        return null;
    }

}
