package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;

public class RedoController extends UseCaseController {

	public RedoController(Session session) {
		super(session);
	}
	
	void redo() {
		this.session.redo();
	}
	
	boolean isRedoable() {
		return this.session.isRedoable();
	}

}
