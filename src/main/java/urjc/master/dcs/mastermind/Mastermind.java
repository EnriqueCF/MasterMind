package urjc.master.dcs.mastermind;

import urjc.master.dcs.mastermind.model.Board;
import urjc.master.dcs.mastermind.utils.YesNoDialog;
import urjc.master.dcs.mastermind.view.MessageView;
import urjc.master.dcs.mastermind.view.View;

public class Mastermind {

	private Board board;

	private View view;

	public static void main(String[] args) {
		new Mastermind().play();
	}

	private Mastermind() {
		this.board = new Board();
		this.view = new View(this.board);
	}

	private void play() {
		do {
			this.view.interact();
			writeResult();
		} while (!isFinished());
	}

	private void writeResult() {
		if (this.board.hasWinner()) {
			MessageView.WINNER.writeln();
		} else {
			MessageView.LOOSER.writeln();
		}
	}

	private boolean isFinished() {
		MessageView.RESUME.write();
		return new YesNoDialog().read(MessageView.RESUME.toString());
	}

}
