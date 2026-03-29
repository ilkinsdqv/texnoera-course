package l06.algorithims.datastructures.homework;

import java.util.LinkedList;
import java.util.Queue;

public class Task11HardNumberOfIslands {
    public static void main(String[] args) {
        //Use a 2D char grid containing '1' (land) and '0' (water).
        //Count islands using DFS or BFS.
        //Mark visited cells to avoid reprocessing.
        //Print island count.
        //Keep traversal logic in helper method.
        char[][][] gridIslands = {
                {{'1','1','1'},{'0','1','0'},{'1','1','1'}}, //1
                {{'1','0','1'},{'0','1','0'},{'1','0','1'}}, //5
                {{'1','1','0'},{'1','1','0'},{'0','0','0'}}, //1
                {{'1','0','1','0','1'}},                     //3
                {{'1'},{'0'},{'1'},{'0'},{'1'}},             //3
                {{'0','0'},{'0','0'}},                       //0
                {{'1','1'},{'1','1'}},                       //1
                {{'1','0','0','1'},{'0','0','0','0'},{'1','0','0','1'}}, //4
                {{'1','1','1','1'},{'1','0','0','1'},{'1','1','1','1'}}, //1
                {{'1','0','1'},{'1','1','1'},{'1','0','1'}}  //1
        };

        for (char[][] gridIsland : gridIslands) {
            System.out.println("**********Map*********");
            numIslandsDFS(gridIsland.clone());
            numIslandsBFS(gridIsland.clone());
        }
    }

    private static void numIslandsBFS(char[][] gridIsland) {
        if(gridIsland == null || gridIsland.length == 0 || gridIsland[0].length == 0)return;
        int islandCount = 0;
        int rows = gridIsland.length;
        int cols = gridIsland[0].length;
        boolean[][] visited = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(gridIsland[i][j] == '1' && !visited[i][j]) {
                    islandCount++;
                    Queue<int[]> neighbours = new LinkedList<>();
                    bfs(gridIsland, visited, neighbours, i, j);
                }
            }
        }

        for (char[] chars : gridIsland) {
            for (char aChar : chars) {
                System.out.print(aChar + " ");
            }
            System.out.println();
        }
        System.out.println("Island Count: " + islandCount);
    }

    private static void bfs(char[][] gridIsland, boolean[][] visited, Queue<int[]> neighbours, int i, int j) {
        if(i < 0 || j < 0 || i >= gridIsland.length || j >= gridIsland[0].length || gridIsland[i][j] == '0' || visited[i][j])return;
        neighbours.add(new int[]{i, j});
        visited[i][j] = true;
        while(!neighbours.isEmpty()) {
            neighbours.poll();
            bfs(gridIsland, visited, neighbours, i - 1, j);
            bfs(gridIsland, visited, neighbours, i + 1, j);
            bfs(gridIsland, visited, neighbours, i, j - 1);
            bfs(gridIsland, visited, neighbours, i, j + 1);
        }
    }

    private static void numIslandsDFS(char[][] gridIsland) {
        if(gridIsland == null || gridIsland.length == 0 || gridIsland[0].length == 0) return;
        boolean[][] visited = new boolean[gridIsland.length][gridIsland[0].length];
        int islandCount = 0;
        for (int i = 0; i < gridIsland.length; i++) {
            for (int j = 0; j < gridIsland[i].length; j++) {
                if(gridIsland[i][j] == '1' && !visited[i][j]) {
                    islandCount++;
                    dfs(gridIsland,visited, i, j);
                }
            }
        }
        for (char[] chars : gridIsland) {
            for (char aChar : chars) {
                System.out.print(aChar + " ");
            }
            System.out.println();
        }
        System.out.println("Island Count: " + islandCount);
    }

    private static void dfs(char[][] gridIsland, boolean[][] visited, int i, int j) {
        if(i<0 || j <0 || i>=gridIsland.length || j>=gridIsland[0].length || gridIsland[i][j] == '0' || visited[i][j]) return;
        visited[i][j] = true;
        dfs(gridIsland, visited, i - 1, j);
        dfs(gridIsland, visited, i + 1, j);
        dfs(gridIsland, visited, i, j - 1);
        dfs(gridIsland, visited, i, j + 1);
    }
}
