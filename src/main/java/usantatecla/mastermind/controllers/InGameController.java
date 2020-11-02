package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;

public abstract class InGameController extends Controller{

	InGameController(Session session) {
		super(session);
	}

	protected abstract void inGameControl();

	@Override
	public void control() {
		this.inGameControl();
		this.writeBoard();
		if (this.session.isTicTacToe()) {
			this.gameView.writeWinner(Token.values()[session.getValueFromTurn()].getChar());
			this.session.next();
		}
	}
}
