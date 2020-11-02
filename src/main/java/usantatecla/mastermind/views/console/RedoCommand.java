package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.ProposalController;

public class RedoCommand extends ConsoleCommand{

	public RedoCommand(String title, ProposalController controller) {
		super(title, controller);
	}

	@Override
	protected void execute() {
		this.controller.redo();
		
	}

	@Override
	protected boolean isActive() {
		return this.controller.isRedoable();
	}

}
