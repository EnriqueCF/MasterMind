package doo.mastermind.views.console;

import doo.mastermind.controllers.PlayController;
import doo.mastermind.models.ProposedCombination;
import doo.mastermind.views.MessageView;
import doo.utils.WithConsoleView;

class ProposalView extends WithConsoleView {

	boolean interact(PlayController playController) {
		ProposedCombination proposedCombination = new ProposedCombination();
		ProposedCombinationView proposedCombinationView = new ProposedCombinationView(proposedCombination);
		proposedCombinationView.read();
		playController.addProposedCombination(proposedCombination);
		this.console.writeln();
		int attempts = playController.getAttempts();
		MessageView.ATTEMPTS.writeln(attempts);
		new SecretCombinationView().writeln();
		
		for (int i = 0; i < attempts; i++) {
			new ProposedCombinationView(playController.getProposedCombination(i)).write();
			new ResultView(playController.getResult(i)).writeln();
		}
		if (playController.isWinner()) {
			MessageView.WINNER.writeln();
			return true;
		} else if (playController.isLooser()) {
			MessageView.LOOSER.writeln();
			return true;
		}
		return false;
	}

}
