package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;

public class UndoController extends InGameController{

	UndoController(Session session) {
		super(session);
	}

	@Override
	protected void inGameControl() {
		this.session.undo();
	}

}
