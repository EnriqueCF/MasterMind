package doo.mastermind.views.console;

import doo.mastermind.models.Board;
import doo.mastermind.models.ProposedCombination;
import doo.mastermind.views.MessageView;
import doo.utils.WithConsoleView;

class ProposalView extends WithConsoleView {

	private Board game;
	
	private SecretCombinationView secretCombinationView;

	ProposalView(Board game) {
		this.game = game;
		this.secretCombinationView = new SecretCombinationView();
	}

	boolean interact() {
		ProposedCombination proposedCombination = new ProposedCombination();
		ProposedCombinationView proposedCombinationView = new ProposedCombinationView(proposedCombination);
		proposedCombinationView.read();
		this.game.addProposedCombination(proposedCombination);
		this.console.writeln();
		MessageView.ATTEMPTS.writeln(this.game.getAttempts());
		this.secretCombinationView.writeln();
		for (int i = 0; i < this.game.getAttempts(); i++) {
			new ProposedCombinationView(this.game.getProposedCombination(i)).write();
			new ResultView(this.game.getResult(i)).writeln();
		}
		if (this.game.isWinner()) {
			MessageView.WINNER.writeln();
			return true;
		} else if (this.game.isLooser()) {
			MessageView.LOOSER.writeln();
			return true;
		}
		return false;
	}

}
