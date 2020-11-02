package usantatecla.mastermind.views.console;

import java.util.List;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.types.Color;
import usantatecla.mastermind.types.Error;
import usantatecla.mastermind.views.MessageView;

public class ProposalCommand extends ConsoleCommand {

	ProposalCommand(String title, ProposalController controller) {
		super(title, controller);
	}

	@Override
	protected void execute() {
		Error error;
		do {
			List<Color> colors = new ProposedCombinationView(controller).read();
			error = controller.addProposedCombination(colors);
			if (error != null) {
				new ErrorView(error).writeln();
			}
		} while (error != null);
		this.console.writeln();
		new AttemptsView(controller).writeln();
		new SecretCombinationView(controller).writeln();
		for (int i = 0; i < controller.getAttempts(); i++) {
			new ProposedCombinationView(controller).write(i);
			new ResultView(controller).writeln(i);
		}
		if (controller.isWinner()) {
			this.console.writeln(MessageView.WINNER.getMessage());
		} else if (controller.isLooser()) {
			this.console.writeln(MessageView.LOOSER.getMessage());
		}

	}

	@Override
	protected boolean isActive() {
		return this.controller.isActive();
	}

}
