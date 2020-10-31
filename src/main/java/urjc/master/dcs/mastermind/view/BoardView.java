package urjc.master.dcs.mastermind.view;

import urjc.master.dcs.mastermind.model.Board;
import urjc.master.dcs.mastermind.utils.Console;

public class BoardView {

	private Board board;
	private SecretView secretView;

	public BoardView(Board board) {
		this.board = board;
	}

	public void writeln() {
		int attemps = this.board.getAttempts();

		Console.instance().writeln();
		MessageView.ATTEMPTS.writeln(attemps);
		this.secretView.writeln();

		for (int i = 0; i < attemps; i++) {
			new ProposedView(board.getRows()[i].getProposedCombination()).write();
			new FeedbackView(board.getRows()[i].getFeedback()).writeln();
		}
	}

}
