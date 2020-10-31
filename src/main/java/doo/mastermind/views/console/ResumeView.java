package doo.mastermind.views.console;

import doo.mastermind.models.Board;
import doo.mastermind.views.MessageView;
import doo.utils.YesNoDialog;

class ResumeView {

	private Board game;

	ResumeView(Board game) {
		this.game = game;
	}

	boolean interact() {
		MessageView.RESUME.write();
		boolean newGame = new YesNoDialog().read();
		if (newGame) {
			this.game.clear();
		}
		return newGame;
	}

}
