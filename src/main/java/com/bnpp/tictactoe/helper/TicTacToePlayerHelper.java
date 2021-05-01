package com.bnpp.tictactoe.helper;

import org.springframework.stereotype.Component;

import com.bnpp.tictactoe.utils.TicTacToeConstants;
import com.bnpp.tictactoe.utils.TicTacToeUtils;

/**
 * 
 * @author gyelugot
 *
 */
@Component
public class TicTacToePlayerHelper {

	public void playGame(String[][] board) {

	}

	/**
	 * method to check if the game is ended by checking if any player has won or tie
	 * with board is full
	 * 
	 * @param board
	 * @param player1
	 * @param player2
	 * @return
	 */
	public boolean isGameEnded(String[][] board, String player1, String player2) {
		boolean gameEnded = false;
		if (playerWonGame(board).equals(TicTacToeConstants.X_MOVED_POSITION)) {
			System.out.println(player1 + TicTacToeConstants.WON_MESSAGE);
			gameEnded = true;
		} else if (playerWonGame(board).equals(TicTacToeConstants.O_MOVED_POSITION)) {
			System.out.println(player2 + TicTacToeConstants.WON_MESSAGE);
			gameEnded = true;
		} else if (TicTacToeUtils.isBoardFull(board)) {
			System.out.println(TicTacToeConstants.TIE_MESSAGE);
			gameEnded = true;
		}
		return gameEnded;
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
