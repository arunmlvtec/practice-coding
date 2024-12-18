package main.leetcode;


/**
 * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
 * <p>
 * Each row must contain the digits 1-9 without repetition.
 * Each column must contain the digits 1-9 without repetition.
 * Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 * Note:
 * <p>
 * A Sudoku board (partially filled) could be valid but is not necessarily solvable.
 * Only the filled cells need to be validated according to the mentioned rules.
 * <p>
 *
 * Example 1:
 * <p>
 *
 * Input: board =
 * [["5","3",".",".","7",".",".",".","."]
 * ,["6",".",".","1","9","5",".",".","."]
 * ,[".","9","8",".",".",".",".","6","."]
 * ,["8",".",".",".","6",".",".",".","3"]
 * ,["4",".",".","8",".","3",".",".","1"]
 * ,["7",".",".",".","2",".",".",".","6"]
 * ,[".","6",".",".",".",".","2","8","."]
 * ,[".",".",".","4","1","9",".",".","5"]
 * ,[".",".",".",".","8",".",".","7","9"]]
 * Output: true
 * Example 2:
 * <p>
 * Input: board =
 * [["8","3",".",".","7",".",".",".","."]
 * ,["6",".",".","1","9","5",".",".","."]
 * ,[".","9","8",".",".",".",".","6","."]
 * ,["8",".",".",".","6",".",".",".","3"]
 * ,["4",".",".","8",".","3",".",".","1"]
 * ,["7",".",".",".","2",".",".",".","6"]
 * ,[".","6",".",".",".",".","2","8","."]
 * ,[".",".",".","4","1","9",".",".","5"]
 * ,[".",".",".",".","8",".",".","7","9"]]
 * Output: false
 * Explanation: Same as Example 1, except with the 5 in the top left corner being modified to 8. Since there are two 8's in the top left 3x3 sub-box, it is invalid.
 * <p>
 *
 * Constraints:
 * <p>
 * board.length == 9
 * board[i].length == 9
 * board[i][j] is a digit 1-9 or '.'.
 * <p>
 *
 *
 */

public class ValidateSudoku {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] > 47 && board[i][j] < 58) {
                    int startI = i / 3;
                    int startJ = j / 3;
                    if (!(validateBlock(board, startI * 3, startJ * 3, board[i][j], i, j)
                            && validateRow(board, i, board[i][j], i, j)
                            && validateCol(board, j, board[i][j], i, j))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    private boolean validateBlock(char[][] board, int startI, int startJ, char c, int charI, int charJ) {
        for (int i = startI; i < startI + 3; i++) {
            for (int j = startJ; j < startJ + 3; j++) {
                if (board[i][j] == c && i != charI && j != charJ) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean validateRow(char[][] board, int ind, char c, int charI, int charJ) {
        for (int i = 0; i < 9; i++) {
            if (c == board[ind][i] && i != charJ) {
                return false;
            }
        }
        return true;
    }

    private boolean validateCol(char[][] board, int ind, char c, int charI, int charJ) {
        for (int i = 0; i < 9; i++) {
            if (c == board[i][ind] && i != charI) {
                return false;
            }
        }
        return true;
    }
}
