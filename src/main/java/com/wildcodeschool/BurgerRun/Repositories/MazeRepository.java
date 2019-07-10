package com.wildcodeschool.BurgerRun.Repositories;

import com.wildcodeschool.BurgerRun.Entities.Maze;

public class MazeRepository {
    private static Maze maze = getMaze();

    public static Maze getMaze() {
        if (maze == null) {
            maze = new Maze();
        }
        return maze;
    }

    public void initMaze() {
        int size = maze.getSize();
        String[] strings = {
            "#######",
            "#   # S",
            "# # # #",
            "# # # #",
            "E #   #",
            "#######"
        };
        String[][] matrice = new String[size][];
        for (int i = 0; i < size; i++) {
            matrice[i] = strings[i].split("");
        }
        maze.setMatrice(matrice);
    }
}