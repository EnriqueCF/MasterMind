package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.utils.Console;

abstract class ConsoleCommand extends usantatecla.utils.Command {

	protected ProposalController controller;
	protected Console console;
	
	protected ConsoleCommand(String title, ProposalController controller) {
		super(title);
		this.controller = controller;
		this.console = new Console();
	}
}
