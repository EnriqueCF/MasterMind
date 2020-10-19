package urjc.master.dcs.mastermind;

import urjc.master.dcs.mastermind.utils.YesNoDialog;

public class Mastermind {
	private Board board;
	private Turn turn;

	public void play() {
		Message.TITLE.writeln();
		do {
			playGame();
			writeResult();
		} while (!isFinished());
	}

	private void playGame() {
		this.board = new Board();
		this.turn = new Turn(board);
		do {
			this.turn.play(board);
			this.board.writeln();
		} while (!this.board.isCompleted());
	}

	private void writeResult() {
		if (this.board.hasWinner()) {
			Message.WINNER.writeln();
		} else {
			Message.LOOSER.writeln();
		}
	}
	
	private boolean isFinished() {
		return new YesNoDialog().read(Message.RESUME.toString());
	}

	public static void main(String[] args) {
		new Mastermind().play();
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public Turn getTurn() {
		return turn;
	}

	public void setTurn(Turn turn) {
		this.turn = turn;
	}


}
