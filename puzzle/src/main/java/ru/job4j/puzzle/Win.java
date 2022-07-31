package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        for (int row = 0; row < board.length; ++row) {
            if (checkRow(board, row)) {
                return true;
            }
        }
        for (int col = 1; col < board[0].length; ++col) {
            if (checkColumn(board, col)) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkRow(int[][] board, int row) {
        for (int col = 0; col < board[row].length; ++col) {
            if (board[row][col] == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkColumn(int[][] board, int column) {
        for (int row = 0; row < board.length; ++row) {
            if (board[row][column] == 0) {
                return false;
            }
        }
        return true;
    }
}