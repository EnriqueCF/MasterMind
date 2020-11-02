package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;

public class RedoController extends InGameController {

	RedoController(Session session) {
		super(session);
	}

	@Override
	protected void inGameControl() {
		this.session.redo();

	}

	boolean redoable() {
		return this.session.isRedoable();
	}

}
