package com.bnpp.tictactoe.mapper;

/**
 * 
 * @author gyelugot
 *
 */
public class BoardMapper {

	private BoardMapper() {

	}

	/**
	 * method to map the numbers (1-9) on tic-tac-toe board to board array values
	 * 
	 * @param board
	 * @param enteredNum
	 * @param crossOrO
	 */
	public static void setBoardValue(String[][] board, int enteredNum, String crossOrO) {

		switch (enteredNum) {
		case 1:
			board[0][0] = crossOrO;
			break;

		case 2:
			board[0][1] = crossOrO;
			break;
		case 3:
			board[0][2] = crossOrO;
			break;
		case 4:
			board[1][0] = crossOrO;
			break;
		case 5:
			board[1][1] = crossOrO;
			break;
		case 6:
			board[1][2] = crossOrO;
			break;
		case 7:
			board[2][0] = crossOrO;
			break;
		case 8:
			board[2][1] = crossOrO;
			break;
		case 9:
			board[2][2] = crossOrO;
			break;
		default:

		}

	}

	/**
	 * method to get the board array values from the number values.
	 * 
	 * @param board
	 * @param numVal
	 * @return
	 */
	public static String getBoardValue(String[][] board, int numVal) {

		String crossOrO = null;
		switch (numVal) {
		case 1:
			crossOrO = board[0][0];
			break;

		case 2:
			crossOrO = board[0][1];
			break;
		case 3:
			crossOrO = board[0][2];
			break;
		case 4:
			crossOrO = board[1][0];
			break;
		case 5:
			crossOrO = board[1][1];
			break;
		case 6:
			crossOrO = board[1][2];
			break;
		case 7:
			crossOrO = board[2][0];
			break;
		case 8:
			crossOrO = board[2][1];
			break;
		case 9:
			crossOrO = board[2][2];
			break;
		default:
			crossOrO = null;
		}
		return crossOrO;
	}

}