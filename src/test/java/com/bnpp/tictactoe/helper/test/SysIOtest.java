package com.bnpp.tictactoe.helper.test;

import com.bnpp.tictactoe.io.ConsoleIO;

public class SysIOtest implements ConsoleIO {

	private String inputStr;
	private int inputInt;

	public void setInputStr(String inputStr) {
		this.inputStr = inputStr;
	}

	public void setInputInt(int inputInt) {
		this.inputInt = inputInt;
	}

	public String getUserInputString() {
		return inputStr;
	}

	public int getUserInputInt() {
		return inputInt;
	}

}
