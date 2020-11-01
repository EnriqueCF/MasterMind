package doo.mastermind;

import doo.mastermind.controllers.FinishedController;
import doo.mastermind.controllers.PlayController;
import doo.mastermind.models.Board;
import doo.mastermind.views.View;

public abstract class Mastermind {
	private Board board;
	private FinishedController finishedController;
	private PlayController playController;
	private View view;

	protected Mastermind() {
		this.board = new Board();
		this.finishedController = new FinishedController(board);
		this.playController = new PlayController(board);
		this.view = this.createView(this.playController, this.finishedController);
	}

	protected void play() {
		this.view.interact();
	}

	protected abstract View createView(PlayController playController, FinishedController finishedController);
}
