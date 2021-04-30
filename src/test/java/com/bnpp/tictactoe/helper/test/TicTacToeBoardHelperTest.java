package com.bnpp.tictactoe.helper.test;

import org.junit.Assert;
import org.junit.Test;

import com.bnpp.tictactoe.helper.TicTacToeBoardHelper;

public class TicTacToeBoardHelperTest {

	TicTacToeBoardHelper ticTacToeBoardHelper;

	@Test
	public void testDisplayBoard() {
		ticTacToeBoardHelper = new TicTacToeBoardHelper();
		String[][] initialBoard = new String[3][3];
		ticTacToeBoardHelper.displayBoard(initialBoard);
		Assert.assertNotNull(initialBoard[2][2]);
	}

}
