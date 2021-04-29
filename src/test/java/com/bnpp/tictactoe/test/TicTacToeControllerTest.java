package com.bnpp.tictactoe.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.modules.junit4.PowerMockRunnerDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bnpp.tictactoe.controller.TicTacToeController;

@RunWith(PowerMockRunner.class)
@PowerMockRunnerDelegate(SpringJUnit4ClassRunner.class)
@PowerMockIgnore({ "com.sun.org.apache.xerces.*", "javax.xml.*", "org.xml.*", "javax.management.*", "org.w3c.*"})
@ContextConfiguration(locations = { "/META-INF/test-context.xml" })
public class TicTacToeControllerTest {

	@Autowired
	TicTacToeController controller;	
	
	@Test
	public void testPlayGame() {
		ResponseEntity<String> response = controller.playGame();
		Assert.assertEquals("Game Ended Successfully", response.getBody());
	}
}

