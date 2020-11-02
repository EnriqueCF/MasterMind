package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.views.MessageView;

public class UndoCommand extends ConsoleCommand {

	public UndoCommand(String title, ProposalController controller) {
		super(MessageView.UNDO.getMessage(), controller);
	}

	@Override
	protected void execute() {
		this.controller.undo();
	}

	@Override
	protected boolean isActive() {
		return this.controller.undoable();
	}

}
