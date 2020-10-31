package doo.mastermind.views.console;

import doo.mastermind.models.SecretCombination;
import doo.mastermind.views.MessageView;
import doo.utils.WithConsoleView;

class SecretCombinationView extends WithConsoleView {

	SecretCombinationView() {
		super();
	}

	void writeln() {
		for (int i = 0; i < SecretCombination.getWidth(); i++) {
			MessageView.SECRET.write();
		}
		this.console.writeln();
	}

}
