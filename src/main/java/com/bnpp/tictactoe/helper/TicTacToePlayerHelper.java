package com.bnpp.tictactoe.helper;

import org.springframework.stereotype.Component;

import com.bnpp.tictactoe.utils.TicTacToeConstants;

/**
 * 
 * @author gyelugot
 *
 */
@Component
public class TicTacToePlayerHelper {

	public void playGame(String[][] board) {

	}

	public boolean isGameEnded(String[][] board, String player1, String player2) {
		return false;
	}

	/**
	 * method to check which player has won the game
	 * 
	 * @param board
	 * @return
	 */
	public String playerWonGame(String[][] board) {

		// Check each row
		for (int i = 0; i < 3; i++) {
			if (board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2])
					&& !board[i][0].equals(TicTacToeConstants.MOVE_ALLOWED_POSITION)) {
				return board[i][0];
			}
		}

		// Check each column
		for (int j = 0; j < 3; j++) {
			if (board[0][j].equals(board[1][j]) && board[1][j].equals(board[2][j])
					&& !board[0][j].equals(TicTacToeConstants.MOVE_ALLOWED_POSITION)) {
				return board[0][j];
			}
		}

		// Check the diagonals
		if (board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])
				&& !board[0][0].equals(TicTacToeConstants.MOVE_ALLOWED_POSITION)) {
			return board[0][0];
		}
		if (board[2][0].equals(board[1][1]) && board[1][1].equals(board[0][2])
				&& !board[2][0].equals(TicTacToeConstants.MOVE_ALLOWED_POSITION)) {
			return board[2][0];
		}

		// Otherwise nobody has won yet
		return TicTacToeConstants.EMPTY_STRING;

	}

}
