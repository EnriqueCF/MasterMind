package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.UseCaseController;
import usantatecla.mastermind.views.MessageView;
import usantatecla.utils.WithConsoleView;

class SecretCombinationView extends WithConsoleView {

	private UseCaseController controller;

	SecretCombinationView(UseCaseController controller) {
		super();
		this.controller = controller;
	}

	void writeln() {
		for (int i = 0; i < this.controller.getWidth(); i++) {
			this.console.write(MessageView.SECRET.getMessage());
		}
		this.console.writeln();
	}

}