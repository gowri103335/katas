package com.bnpp.tictactoe.helper.test;

import org.junit.Assert;
import org.junit.Test;

import com.bnpp.tictactoe.helper.TicTacToePlayerHelper;
import com.bnpp.tictactoe.utils.TicTacToeConstants;

public class TicTacToePlayerHelperTest {

	TicTacToePlayerHelper ticTacToePlayerHelper = null;

	@Test
	public void testPlayGame() {
		ticTacToePlayerHelper = new TicTacToePlayerHelper();
		String[][] board = { { "a", "b", "c" }, { "d", "e", "f" }, { "g", "h", "[ ]" } };
		ticTacToePlayerHelper.playGame(board);
		Assert.assertEquals("[x]", board[2][2]);
	}

	@Test
	public void testInitializeBoard() {
		ticTacToePlayerHelper = new TicTacToePlayerHelper();
		String[][] board = new String[3][3];
		ticTacToePlayerHelper.initializeBoard(board);
		Assert.assertNotNull(board[2][2]);
	}

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

	@Test
	public void testIsGameEnded() {
		ticTacToePlayerHelper = new TicTacToePlayerHelper();
		String[][] boardXmoveWin = { { TicTacToeConstants.X_MOVED_POSITION, TicTacToeConstants.X_MOVED_POSITION,
				TicTacToeConstants.X_MOVED_POSITION }, {}, {} };
		String[][] boardOmoveWin = { { TicTacToeConstants.O_MOVED_POSITION, TicTacToeConstants.O_MOVED_POSITION,
				TicTacToeConstants.O_MOVED_POSITION }, {}, {} };
		String[][] boardFull = { { "a", "b", "c" }, { "a", "e", "f" }, { "a", "h", "i" } };
		String[][] boardNotFull = { { "a", "b", "c" }, { "a", "e", "f" },
				{ "a", "h", TicTacToeConstants.MOVE_ALLOWED_POSITION } };
		Assert.assertEquals(true, ticTacToePlayerHelper.isGameEnded(boardXmoveWin, "player1X", "player2O"));
		Assert.assertEquals(true, ticTacToePlayerHelper.isGameEnded(boardOmoveWin, "player1X", "player2O"));
		Assert.assertEquals(true, ticTacToePlayerHelper.isGameEnded(boardFull, "player1X", "player2O"));
		Assert.assertEquals(false, ticTacToePlayerHelper.isGameEnded(boardNotFull, "player1X", "player2O"));
	}

}
