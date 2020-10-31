package doo.mastermind.views.console;

import doo.mastermind.views.MessageView;
import doo.utils.WithConsoleView;

class StartView extends WithConsoleView {

	void interact() {
		MessageView.TITLE.writeln();
		new SecretCombinationView().writeln();
	}

}
