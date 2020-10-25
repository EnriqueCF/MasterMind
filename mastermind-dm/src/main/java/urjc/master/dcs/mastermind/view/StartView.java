package urjc.master.dcs.mastermind.view;

import urjc.master.dcs.mastermind.utils.WithConsoleView;

class StartView extends WithConsoleView {

	void interact() {
		MessageView.TITLE.writeln();
		new SecretCombinationView().writeln();
	}

}
