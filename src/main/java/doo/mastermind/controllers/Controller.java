package doo.mastermind.controllers;

import doo.mastermind.models.Board;
import doo.mastermind.models.State;

public abstract class Controller {

	protected Board board;
	protected State state;

	Controller(Board board, State state) {
		this.board = board;
		this.state = state;
	}

	public void getNext() {
		this.state.next();
	}
}
