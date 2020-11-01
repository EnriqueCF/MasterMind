package doo.mastermind.views.console;

import doo.mastermind.controllers.Logic;
import doo.mastermind.views.MessageView;
import doo.utils.YesNoDialog;

class ResumeView {

	private Logic logic;
	
	ResumeView(Logic logic) {
		this.logic = logic;
	}

	boolean interact() {
		MessageView.RESUME.write();
		boolean newGame = new YesNoDialog().read();
		if (newGame) {
			this.logic.clear();
		}
		return newGame;
	}

}
