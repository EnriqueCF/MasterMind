package doo.mastermind.views.console;

import doo.mastermind.controllers.Logic;
import doo.mastermind.models.ProposedCombination;
import doo.mastermind.views.MessageView;
import doo.utils.WithConsoleView;

class ProposalView extends WithConsoleView {

	private Logic logic;

	private SecretCombinationView secretCombinationView;

	ProposalView(Logic logic) {
		this.logic = logic;
		this.secretCombinationView = new SecretCombinationView();
	}

	boolean interact() {
		ProposedCombination proposedCombination = new ProposedCombination();
		ProposedCombinationView proposedCombinationView = new ProposedCombinationView(proposedCombination);
		proposedCombinationView.read();
		this.logic.addProposedCombination(proposedCombination);
		this.console.writeln();
		int attempts = this.logic.getAttempts();
		MessageView.ATTEMPTS.writeln(attempts);
		this.secretCombinationView.writeln();
		for (int i = 0; i < attempts; i++) {
			new ProposedCombinationView(this.logic.getProposedCombination(i)).write();
			new ResultView(this.logic.getResult(i)).writeln();
		}
		if (this.logic.isWinner()) {
			MessageView.WINNER.writeln();
			return true;
		} else if (this.logic.isLooser()) {
			MessageView.LOOSER.writeln();
			return true;
		}
		return false;
	}

}
