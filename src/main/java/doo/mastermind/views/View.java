package doo.mastermind.views;

import doo.mastermind.models.Board;

public abstract class View {

	protected Board board;
	
	public void interact() {
		boolean newGame;
		do {
			this.start();
			boolean finished;
			do {
				finished = this.play();
			} while (!finished);
			newGame = this.finished();
		} while (newGame);
	}
	
	public View (Board board) {
		this.board = board;
	}
	
	protected abstract void start();
	protected abstract boolean play();
	protected abstract boolean finished();

}
