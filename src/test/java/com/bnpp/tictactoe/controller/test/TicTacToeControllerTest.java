package com.bnpp.tictactoe.controller.test;

import static org.powermock.api.easymock.PowerMock.replay;
import static org.powermock.api.easymock.PowerMock.reset;

import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Before;
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
import com.bnpp.tictactoe.helper.TicTacToeBoardHelper;
import com.bnpp.tictactoe.helper.TicTacToePlayerHelper;
import com.bnpp.tictactoe.io.SystemIO;

@RunWith(PowerMockRunner.class)
@PowerMockRunnerDelegate(SpringJUnit4ClassRunner.class)
@PowerMockIgnore({ "com.sun.org.apache.xerces.*", "javax.xml.*", "org.xml.*", "javax.management.*", "org.w3c.*" })
@ContextConfiguration(locations = { "/META-INF/test-context.xml" })
public class TicTacToeControllerTest {

	@Autowired
	TicTacToeController controller;

	@Autowired
	TicTacToeBoardHelper ticTacToeBoardhelper;

	@Autowired
	TicTacToePlayerHelper ticTacToePlayerHelper;

	@Before
	public void setUp() {
		reset(ticTacToeBoardhelper);
		reset(ticTacToePlayerHelper);
	}

	@Test
	public void testPlayGame() {
		ticTacToeBoardhelper.displayBoard(EasyMock.anyObject(String[][].class));
		EasyMock.expectLastCall().anyTimes();
		replay(ticTacToeBoardhelper);

		ticTacToePlayerHelper.playGame(EasyMock.anyObject(String[][].class));
		EasyMock.expectLastCall().anyTimes();
		ticTacToePlayerHelper.setConsoleIO(EasyMock.anyObject(SystemIO.class));
		EasyMock.expectLastCall().anyTimes();
		ticTacToePlayerHelper.initializeBoard(EasyMock.anyObject(String[][].class));
		EasyMock.expectLastCall().anyTimes();
		replay(ticTacToePlayerHelper);

		ResponseEntity<String> response = controller.playGame();
		Assert.assertEquals("Game Ended Successfully", response.getBody());

	}
}
