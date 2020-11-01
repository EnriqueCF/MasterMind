package doo.mastermind.controllers;

import doo.mastermind.models.Board;

public class FinishedController extends Controller {

	public FinishedController(Board board) {
		super(board);
	}

	public void clear() {
		this.board.clear();
	}

}
