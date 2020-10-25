package urjc.master.dcs.mastermind.view;

import urjc.master.dcs.mastermind.model.Game;
import urjc.master.dcs.mastermind.utils.YesNoDialog;

public class ResumeView {
	private Game game;

	ResumeView(Game game) {
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
