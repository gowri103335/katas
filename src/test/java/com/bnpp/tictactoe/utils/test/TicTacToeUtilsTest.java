package com.bnpp.tictactoe.utils.test;

import org.junit.Assert;
import org.junit.Test;

import com.bnpp.tictactoe.utils.TicTacToeUtils;

public class TicTacToeUtilsTest {

	@Test
	public void testIsPosOnBoardValid() {
		String[][] emptyBoard = new String[3][3];
		emptyBoard[0][0] = "[ ]";
		String[][] board = { { "a", "b", "c" }, { "d", "e", "f" }, { "g", "h", "i" } };
		Assert.assertEquals(false, TicTacToeUtils.isPosOnBoardValid(board, 0));
		Assert.assertEquals(false, TicTacToeUtils.isPosOnBoardValid(board, 10));
		Assert.assertEquals(false, TicTacToeUtils.isPosOnBoardValid(board, 9));
		Assert.assertEquals(true, TicTacToeUtils.isPosOnBoardValid(emptyBoard, 1));
	}

}
