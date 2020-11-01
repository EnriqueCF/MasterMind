package doo.mastermind.views.console;

import doo.mastermind.controllers.FinishedController;
import doo.mastermind.views.MessageView;
import doo.utils.YesNoDialog;

class ResumeView {

	private FinishedController finishedController;
	
	ResumeView(FinishedController finishedController) {
		this.finishedController = finishedController;
	}

	boolean interact() {
		MessageView.RESUME.write();
		boolean newGame = new YesNoDialog().read();
		if (newGame) {
			this.finishedController.clear();
		}
		return newGame;
	}

}
