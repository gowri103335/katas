Tic Tac Toe: 
------------
Problem statement:
------------------
 To develop a program for playing Tic Tac Toe game

Tic Tac Toe game:
-----------------
  It is a game for two players, X and O who will mark the spaces in the 3*3 matrix board in turns and the player who succeeds in placing three of their marks in a diagonal, horizontal, or vertical row is the winner.

Rules:
-----
    X always goes first.
	Players cannot play on a played position.
	Players alternate placing X’s and O’s on the board until either:
		One player has three in a row, horizontally, vertically or diagonally 
		All nine squares are filled.
	If a player is able to draw three X’s or three O’s in a row, that player wins.
	If all nine squares are filled and neither player has three in a row, the game is a draw.

Assumptions:
------------
	Two different players only can play the game one to one with no cheating.
	First player starts game by placing X mark.

Solution:
---------
	Building Restful webservice which can be used to start playing game on console and developed with postURL: http://localhost:8080/Tictactoe/startTicTacToeGame which is used to trigger the start of game.

Compilation:
------------
	Application is compiled with mvn clean install in cmd or clean install in any IDE like eclipse to generate the war file: TicTacToe.war

Running the code:
-----------------
	Prerequisite for running the code is setup of the server on the system. Tomcat server can be downloaded and setup following the steps mentioned in the link: https://crunchify.com/step-by-step-guide-to-setup-and-install-apache-tomcat-server-in-eclipse-development-environment-ide/.
	
	Once the server is setup deploy the war in the server tomcat by copying the war file generated in the above step to location: C:\Program Files\Apache Software Foundation\Tomcat 9.0\webapps and start server by running file: C:\Program Files\Apache Software Foundation\Tomcat 9.0\bin\startup.bat to bring the webservice up. Once service up, start the game by hitting the postURL: http://localhost:8080/Tictactoe/startTicTacToeGame in the postman and start playing in the console.





