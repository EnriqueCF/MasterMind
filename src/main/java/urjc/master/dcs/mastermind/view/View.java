package urjc.master.dcs.mastermind.view;

import urjc.master.dcs.mastermind.model.Board;
import urjc.master.dcs.mastermind.model.Turn;

public class View {

	protected Board board;
	protected Turn turn;

	private StartView startView;
	private BoardView boardView;

	public View(Board board) {
		this.turn = new Turn(board);
		this.board = board;
		this.startView = new StartView();
		this.boardView = new BoardView(board);
	}

	public void interact() {
		this.startView.interact();
		do {
			this.turn.play(board);
			this.boardView.writeln();
		} while (!this.board.isCompleted());
	}

}
