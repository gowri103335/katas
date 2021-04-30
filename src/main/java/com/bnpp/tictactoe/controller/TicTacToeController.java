package com.bnpp.tictactoe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bnpp.tictactoe.helper.TicTacToeBoardHelper;
import com.bnpp.tictactoe.helper.TicTacToePlayerHelper;

/**
 * 
 * @author gyelugot
 *
 */
@RestController
public class TicTacToeController {
	
	@Autowired
	TicTacToeBoardHelper ticTacToeBoardhelper;
	
	@Autowired
	TicTacToePlayerHelper ticTacToePlayerHelper;
	
	
	/**
	 * Restful service which starts the tic tac toe game
	 * @return
	 */
	@PostMapping("/startTicTacToeGame")
	public ResponseEntity<String> playGame(){		
		// Create a 3x3 array that represents our tic tac toe board initially
		String[][] initialBoard = new String[3][3];
		
		// Create a 3x3 array that represents our tic tac toe board during play
		String[][] board = new String[3][3];
		
		//display board initially with numbers on all positions
		ticTacToeBoardhelper.displayBoard(initialBoard);
		
		//players start game
		ticTacToePlayerHelper.playGame(board);		
		
		return ResponseEntity.status(HttpStatus.OK).body("Game Ended Successfully");
	}

}
