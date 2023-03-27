package amigos.dataStructure;

import java.util.Arrays;

public class WorkingWith2DArrays {

    public static void main(String[] args) {
        char[][]board = new char[3][3];
        for (char[] chars : board) {
            Arrays.fill(chars, '-');
        }

        board[0][0] = '0';
        board[1][0] = '0';
        board[2][0] = '0';

        System.out.println(Arrays.deepToString(board));

        }

    }

