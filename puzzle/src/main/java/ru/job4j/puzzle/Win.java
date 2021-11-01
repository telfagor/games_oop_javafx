package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;

        for (int i = 0; i < board.length; i++) {
            if (isHorizontalWin(board, i) || isVerticalWin(board, i)) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }

    public static boolean isHorizontalWin(int[][] board, int row) {
        boolean rsl = true;

        for (int item : board[row]) {
            if (item != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean isVerticalWin(int[][] board, int column) {
        boolean rsl = true;

        for (int[] array : board) {
            if (array[column] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

}
