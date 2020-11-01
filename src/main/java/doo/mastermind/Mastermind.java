package doo.mastermind;

import doo.mastermind.controllers.Logic;
import doo.mastermind.views.View;

public abstract class Mastermind {
	private Logic logic;
	private View view;

	protected Mastermind() {
		this.logic = new Logic();
		this.view = createView(this.logic);
	}

	protected void play() {
		this.view.interact();
	}

	protected abstract View createView(Logic logic);
}
