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
public class TicTacToeBoardHelper {

	/*
	 * method to initialize and display the board
	 */
	public void displayBoard(String[][] board) {
		int num = 1;
		// initialization of board
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = TicTacToeConstants.SQUARE_BRACKET_LEFT + num++ + TicTacToeConstants.SQUARE_BRACKET_RIGHT;
			}
		}

		System.out.println(TicTacToeConstants.TIC_TAC_TOE_MESSAGE);
		System.out.println(TicTacToeConstants.TIC_TAC_TOE_RULE_MESSAGE);

		// draw the board to console.
		TicTacToeUtils.drawBoard(board);
	}

}
