package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;

public class StartController extends UseCaseController implements AcceptorController {

	public StartController(Session session) {
		super(session);
	}
	
	public void start() {
		this.state.next();
	}
	
	@Override
	public void accept(ControllersVisitor controllersVisitor) {
		controllersVisitor.visit(this);
	}

}
