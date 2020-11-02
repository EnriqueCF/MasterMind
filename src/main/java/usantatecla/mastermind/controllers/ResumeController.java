package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;

public class ResumeController extends UseCaseController implements AcceptorController  {

	public ResumeController(Session session) {
		super(session);
	}

	public void resume(boolean newboard) {
		if (newboard) {
			this.session.reset();
		} else {
			this.session.next();
		}
	}

	public void accept(ControllersVisitor controllersVisitor) {
		controllersVisitor.visit(this);
	}


}
