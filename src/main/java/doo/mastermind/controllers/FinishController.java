package doo.mastermind.controllers;

import doo.mastermind.models.Board;
import doo.mastermind.models.State;

public class FinishController extends Controller {

	FinishController(Board board, State state) {
		super(board, state);
	}

	public void resume() {
		this.board.reset();
		this.state.reset();
	}

	public void next() {
		this.state.next();
	}
}
