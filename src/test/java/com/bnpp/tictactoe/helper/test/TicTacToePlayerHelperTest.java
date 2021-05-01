package com.bnpp.tictactoe.helper.test;

import org.junit.Assert;
import org.junit.Test;

import com.bnpp.tictactoe.helper.TicTacToePlayerHelper;

public class TicTacToePlayerHelperTest {

	TicTacToePlayerHelper ticTacToePlayerHelper = null;

	@Test
	public void testPlayerWonGame() {
		ticTacToePlayerHelper = new TicTacToePlayerHelper();
		String[][] boardRowEqual = { { "a", "a", "a" }, {}, {} };
		String[][] boardcolumnEqual = { { "a", "b", "c" }, { "a", "e", "f" }, { "a", "h", "i" } };
		String[][] boardfirstDiagEqual = { { "a", "b", "c" }, { "d", "a", "f" }, { "g", "h", "a" } };
		String[][] boardsecondDiagEqual = { { "a", "b", "a" }, { "d", "a", "f" }, { "a", "h", "i" } };
		String[][] boardNoOneWinYet = { { "a", "b", "c" }, { "d", "e", "f" }, { "g", "h", "i" } };
		Assert.assertEquals("a", ticTacToePlayerHelper.playerWonGame(boardRowEqual));
		Assert.assertEquals("a", ticTacToePlayerHelper.playerWonGame(boardcolumnEqual));
		Assert.assertEquals("a", ticTacToePlayerHelper.playerWonGame(boardfirstDiagEqual));
		Assert.assertEquals("a", ticTacToePlayerHelper.playerWonGame(boardsecondDiagEqual));
		Assert.assertEquals("", ticTacToePlayerHelper.playerWonGame(boardNoOneWinYet));
	}

}
