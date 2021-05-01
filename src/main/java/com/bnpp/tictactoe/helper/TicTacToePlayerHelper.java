package com.bnpp.tictactoe.helper;

import org.springframework.stereotype.Component;

import com.bnpp.tictactoe.io.ConsoleIO;
import com.bnpp.tictactoe.mapper.BoardMapper;
import com.bnpp.tictactoe.utils.TicTacToeConstants;
import com.bnpp.tictactoe.utils.TicTacToeUtils;

/**
 * 
 * @author gyelugot
 *
 */
@Component
public class TicTacToePlayerHelper {

	ConsoleIO console;

	public void setConsoleIO(ConsoleIO input) {
		this.console = input;
	}

	/**
	 * method which starts to play game and has calls to other methods to complete
	 * the game.
	 * 
	 * @param board
	 */

	public void playGame(String[][] board) {

		// ask the players for their names
		System.out.print(TicTacToeConstants.PLAYER1_MESSAGE);
		String p1 = console.getUserInputString();
		System.out.print(TicTacToeConstants.PLAYER2_MESSAGE);
		String p2 = console.getUserInputString();
		// player1 starts the game who gets x
		boolean player1 = true;

		// Create a gameEnded boolean and use it as the condition in the while loop
		boolean gameEnded = false;
		while (!gameEnded) {
			// Draw the board
			TicTacToeUtils.drawBoard(board);
			// Print whose turn it is
			if (player1) {
				System.out.println(p1 + TicTacToeConstants.X_TURN);
			} else {
				System.out.println(p2 + TicTacToeConstants.O_TURN);
			}
			// Create a String variable that stores either 'x' or 'o' based on what player's
			// turn it is
			String crossOrO;
			if (player1) {
				crossOrO = TicTacToeConstants.X_MOVED_POSITION;
			} else {
				crossOrO = TicTacToeConstants.O_MOVED_POSITION;
			}

			// Initialize the enteredNum which represent number positions that correspond to
			// a position on our board
			int enteredNum = 0;
			// Only break out of the while loop once the user enters a valid position
			while (true) {
				// Ask the user for what position they want to place their x or o
				System.out.print(TicTacToeConstants.ENTER_NUMBER_MESSAGE);
				enteredNum = console.getUserInputInt();
				// validate the postion entered on board
				if (TicTacToeUtils.isPosOnBoardValid(board, enteredNum)) {
					break;
				}
			}
			// Set the board array elements mapping with the number values
			BoardMapper.setBoardValue(board, enteredNum, crossOrO);
			// check if the game has ended and end while loop else give the turn to other
			// player to play
			if (isGameEnded(board, p1, p2)) {
				gameEnded = true;
			} else {
				player1 = !player1;
			}
		}

		// Draw the board at the end of the game
		TicTacToeUtils.drawBoard(board);

	}

	/**
	 * initializtion of board before play starts.
	 * 
	 * @param board
	 */
	public void initializeBoard(String[][] board) {
		// initialization of board
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = TicTacToeConstants.MOVE_ALLOWED_POSITION;
			}
		}
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
