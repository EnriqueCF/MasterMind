package urjc.master.dcs.mastermind.view;

import urjc.master.dcs.mastermind.model.Board;
import urjc.master.dcs.mastermind.model.Turn;

public class View {

	protected Board board;
	protected Turn turn;
	
	private StartView startView;
	public BoardView boardView;
	
	public View(Board board, Turn turn) {
		this.turn =  new Turn(board);
		this.board = board;
		this.startView = new StartView();
	}

	public void interact() {
		boolean newGame;
		do {
			this.startView.interact();
			boolean finished;
			do {
//				finished = this.proposalView.interact();
			} while (!false);
		} while (newGame);
	}
	
//	public void play() {
//	Message.TITLE.writeln();
//	do {
//		playGame();
//		writeResult();
//	} while (!isFinished());
//}
//
//private void playGame() {
//	this.board = new Board();
//	this.turn = new Turn(board);
//	do {
//		this.turn.play(board);
//		this.board.writeln();
//	} while (!this.board.isCompleted());
//}
}
