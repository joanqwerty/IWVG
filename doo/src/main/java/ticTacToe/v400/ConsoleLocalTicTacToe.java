package ticTacToe.v400;

import ticTacToe.v400.aplication.TicTacToe;
import ticTacToe.v400.controllers.local.LocalLogic;
import ticTacToe.v400.views.console.ConsoleView;

public class ConsoleLocalTicTacToe {

	public static void main(String[] args) {
		new TicTacToe(new ConsoleView(), new LocalLogic()).play();
	}
}