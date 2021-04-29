package com.bnpp.tictactoe.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicTacToeController {
	
	@PostMapping("/startTicTacToeGame")
	public ResponseEntity<String> playGame(){
		return null;		
	}

}
