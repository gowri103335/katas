package com.bnpp.tictactoe.io;

import java.util.Scanner;

public class SystemIO implements ConsoleIO {

	private final Scanner scanner = new Scanner(System.in);

	public String getUserInputString() {
		return scanner.nextLine();
	}

	public int getUserInputInt() {
		return scanner.nextInt();
	}

}
