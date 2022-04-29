package ru.job4j.puzzle;

public class Win {

    public static boolean check(int[][] board) {
        boolean result = false;
        for (int row = 0; row < board.length; row++) {
            if (board[row][row] == 1
                    && (isHorizontalWin(board, row) || isVerticalWin(board, row))) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean isHorizontalWin(int[][] board, int row) {
        boolean result = true;
        for (int cell = 0; cell < board[row].length; cell++) {
            if (board[row][cell] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean isVerticalWin(int[][] board, int column) {
        boolean result = true;
        for (int row = 0; row < board.length; row++) {
            if (board[row][column] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

}
