package doo.mastermind.controllers;

import doo.mastermind.models.Board;

public class FinishController extends Controller {

	public FinishController(Board board) {
		super(board);
	}

	public void clear() {
		this.board.clear();
	}

}
