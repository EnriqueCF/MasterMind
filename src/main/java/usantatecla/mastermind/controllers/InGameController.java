package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.views.MessageView;
import usantatecla.mastermind.views.ProposedCombinationView;
import usantatecla.mastermind.views.ResultView;
import usantatecla.mastermind.views.SecretCombinationView;

public abstract class InGameController extends Controller {

	InGameController(Session session) {
		super(session);
	}

	protected abstract void inGameControl();

	@Override
	public void control() {
		this.inGameControl();

		MessageView.ATTEMPTS.writeln(this.session.getAttempts());
		new SecretCombinationView().writeln();

		for (int i = 0; i < this.session.getAttempts(); i++) {
			new ProposedCombinationView().write(this.session.getColors(i));
			new ResultView().writeln(this.session.getBlacks(i), this.session.getWhites(i));
		}

		if (this.session.isWinner()) {
			MessageView.PLAYER_WIN.writeln();
			this.session.next();
		} else if (this.session.isLooser()) {
			MessageView.PLAYER_LOST.writeln();
			this.session.next();
		}
	}
}
