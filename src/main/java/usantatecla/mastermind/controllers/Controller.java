package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.State;

public abstract class Controller {

	protected State state;

	Controller(State state) {
		this.state = state;
	}

	public void next() {
		this.state.next();
	}

}
