package urjc.master.dcs.mastermind;

import urjc.master.dcs.mastermind.model.Board;
import urjc.master.dcs.mastermind.model.Turn;
import urjc.master.dcs.mastermind.view.View;

public class Mastermind {

	private Turn turn;
	private Board board;

	private View view;

	private Mastermind() {
		this.board = new Board();
		this.turn = new Turn(board);
		this.view = new View(this.board, this.turn);
	}

	private void play() {
		this.view.interact();
	}

	public static void main(String[] args) {
		new Mastermind().play();
	}

//	private Board board;
//	private Turn turn;
//
//	public void play() {
//		Message.TITLE.writeln();
//		do {
//			playGame();
//			writeResult();
//		} while (!isFinished());
//	}
//
//	private void playGame() {
//		this.board = new Board();
//		this.turn = new Turn(board);
//		do {
//			this.turn.play(board);
//			this.board.writeln();
//		} while (!this.board.isCompleted());
//	}
//
//	private void writeResult() {
//		if (this.board.hasWinner()) {
//			Message.WINNER.writeln();
//		} else {
//			Message.LOOSER.writeln();
//		}
//	}
//	
//	private boolean isFinished() {
//		return new YesNoDialog().read(Message.RESUME.toString());
//	}

}
