package doo.mastermind.views.console;

import doo.mastermind.controllers.FinishController;
import doo.mastermind.views.MessageView;
import doo.utils.YesNoDialog;

class ResumeView {

	public boolean interact(FinishController controller) {
		MessageView.RESUME.write();
		boolean newGame = new YesNoDialog().read();
		if(newGame) {
			controller.resume();
		} else {
			controller.next();
		}
		
		return newGame;
	}

}
