package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;

public abstract class UseCaseController {

	protected Session session;
	
	public UseCaseController(Session session) {
		this.session = session;
	}
	
	public int getWidth() {
		return this.session.getWidth();
	}
}
