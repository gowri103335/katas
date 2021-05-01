package com.bnpp.tictactoe.mapper.test;

import org.junit.Assert;
import org.junit.Test;

import com.bnpp.tictactoe.mapper.BoardMapper;

public class BoardMapperTest {

	@Test
	public void testSetBoardValue() {
		String[][] board = new String[3][3];
		BoardMapper.setBoardValue(board, 1, "a");
		BoardMapper.setBoardValue(board, 2, "b");
		BoardMapper.setBoardValue(board, 3, "c");
		BoardMapper.setBoardValue(board, 4, "d");
		BoardMapper.setBoardValue(board, 5, "e");
		BoardMapper.setBoardValue(board, 6, "f");
		BoardMapper.setBoardValue(board, 7, "g");
		BoardMapper.setBoardValue(board, 8, "h");
		BoardMapper.setBoardValue(board, 9, "i");
		Assert.assertEquals("a", board[0][0]);
		Assert.assertEquals("b", board[0][1]);
		Assert.assertEquals("c", board[0][2]);
		Assert.assertEquals("d", board[1][0]);
		Assert.assertEquals("e", board[1][1]);
		Assert.assertEquals("f", board[1][2]);
		Assert.assertEquals("g", board[2][0]);
		Assert.assertEquals("h", board[2][1]);
		Assert.assertEquals("i", board[2][2]);
	}

}
