package com.bnpp.tictactoe.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bnpp.tictactoe.helper.TicTacToeBoardHelper;
import com.bnpp.tictactoe.helper.TicTacToePlayerHelper;
import com.bnpp.tictactoe.io.SystemIO;
import com.bnpp.tictactoe.utils.TicTacToeConstants;

/**
 * 
 * @author gyelugot
 *
 */
@RestController
public class TicTacToeController {

	private static final Logger LOGGER = LogManager.getLogger(TicTacToeController.class);

	@Autowired
	TicTacToeBoardHelper ticTacToeBoardhelper;

	@Autowired
	TicTacToePlayerHelper ticTacToePlayerHelper;

	/**
	 * Restful service which starts the tic tac toe game
	 * 
	 * @return
	 */
	@PostMapping("/startTicTacToeGame")
	public ResponseEntity<String> playGame() {
		LOGGER.info("Game Started");
		// Create a 3x3 array that represents our tic tac toe board initially
		String[][] initialBoard = new String[3][3];

		// Create a 3x3 array that represents our tic tac toe board during play
		String[][] board = new String[3][3];

		// display board initially with numbers on all positions
		ticTacToeBoardhelper.displayBoard(initialBoard);

		// players start game
		ticTacToePlayerHelper.setConsoleIO(new SystemIO());
		ticTacToePlayerHelper.initializeBoard(board);
		ticTacToePlayerHelper.playGame(board);

		LOGGER.info("Game Ended");
		return ResponseEntity.status(HttpStatus.OK).body(TicTacToeConstants.GAME_ENDED_MESSAGE);
	}

}
