package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.models.State;
import usantatecla.mastermind.views.ResumeView;

public class ResumeController extends Controller {

	ResumeController(Game game, State state) {
		super(game, state);
	}

	private void resume(boolean newGame) {
		if (newGame) {
			this.game.clear();
			this.state.reset();
		} else {
			this.state.next();
		}
	}

	@Override
	public void control() {
		this.resume(new ResumeView().read());
	}

}
