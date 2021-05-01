package com.bnpp.tictactoe.utils;

public class TicTacToeUtils {

	private TicTacToeUtils() {

	}
	/**
	 * method to draw the board on console.
	 * @param board
	 */
	public static void drawBoard(String[][] board) {
		System.out.println(TicTacToeConstants.BOARD);

		for (int i = 0; i < 3; i++) {
			// The inner for loop prints out each row of the board
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j]);
			}
			// This makes a new line so that each row is on a separate line
			System.out.println();
		}
	}

}
