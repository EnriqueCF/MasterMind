package doo.mastermind.views.graphics;

import doo.mastermind.controllers.FinishedController;
import doo.mastermind.views.MessageView;
import doo.utils.YesNoDialog;

class ResumeView {

	private FinishedController controller;

	ResumeView(FinishedController controller) {
		this.controller = controller;
	}

	boolean interact() {
		MessageView.RESUME.write();
		boolean newGame = new YesNoDialog().read();
		if (newGame) {
			this.controller.clear();
		}
		return newGame;
	}

}
