package doo.mastermind;

import doo.mastermind.models.Board;
import doo.mastermind.views.View;

public abstract class Mastermind {
	private Board board;
	private View view;

	protected Mastermind() {
		this.board = new Board();
		this.view = this.createView(board);
	}

	protected void play() {
		this.view.interact();
	}

	protected abstract View createView(Board board);
}
