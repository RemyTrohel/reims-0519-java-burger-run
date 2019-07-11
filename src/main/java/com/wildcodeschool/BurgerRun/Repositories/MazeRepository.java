package com.wildcodeschool.BurgerRun.repositories;

import com.wildcodeschool.BurgerRun.entities.Maze;

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
        String[][] matrix = new String[size][];
        for (int i = 0; i < size; i++) {
            matrix[i] = strings[i].split("");
        }
        maze.setMatrix(matrix);
    }

    public boolean canGoUp(int row, int col) {
        return maze.getMatrix()[row-1][col].equals("");
    }

    public boolean canGoDown(int row, int col) {
        return maze.getMatrix()[row+1][col].equals("");
    }

    public boolean canGoRight(int row, int col) {
        return maze.getMatrix()[row][col+1].equals("");
    }

    public boolean canGoLeft(int row, int col) {
        return maze.getMatrix()[row][col-1].equals("");
    }

    public int[] getUp(int row, int col) {
        return new int[] {row-1, col};
    }

    public int[] getDown(int row, int col) {
        return new int[] {row+1, col};
    }

    public int[] getRight(int row, int col) {
        return new int[] {row, col+1};
    }

    public int[] getLeft(int row, int col) {
        return new int[] {row, col-1};
    }
}