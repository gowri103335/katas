package com.bnpp.tictactoe.utils;

import com.bnpp.tictactoe.mapper.BoardMapper;

/**
 * 
 * @author gyelugot
 *
 */
public class TicTacToeUtils {

	private TicTacToeUtils() {

	}

	/**
	 * method to draw the board on console.
	 * 
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

	/**
	 * method to valid the position on the tic-tac-toe board
	 * 
	 * @param board
	 * @param posEntered
	 * @return
	 */
	public static boolean isPosOnBoardValid(String[][] board, int posEntered) {
		boolean posValid = true;

		// Check if the position on the board the user entered is out of bounds of board
		if (posEntered < 1 || posEntered > 9) {
			posValid = false;
			System.out.println(TicTacToeConstants.POSITION_OUTOF_BOUND);

			// Check if the position on the board the user entered is empty or not
		} else if (!BoardMapper.getBoardValue(board, posEntered).equals(TicTacToeConstants.MOVE_ALLOWED_POSITION)) {
			posValid = false;
			System.out.println(TicTacToeConstants.ALREADY_MOVED_POSITION);
		}
		return posValid;
	}

	/**
	 * method ot check if the board is full with all positions moved
	 * 
	 * @param board
	 * @return
	 */
	public static boolean isBoardFull(String[][] board) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j].equals(TicTacToeConstants.MOVE_ALLOWED_POSITION)) {
					return false;
				}
			}
		}
		return true;
	}

}
