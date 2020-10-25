package urjc.master.dcs.mastermind.view;

import urjc.master.dcs.mastermind.model.SecretCombination;
import urjc.master.dcs.mastermind.utils.WithConsoleView;

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

