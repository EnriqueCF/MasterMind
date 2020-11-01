package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Board;
import usantatecla.mastermind.models.State;

public abstract class Controller {

	protected Board board;
	
	protected State state;

	Controller(Board board, State state) {
		this.board = board;
		this.state = state;
	}
	
	public int getWidth() {
		return this.board.getWidth();
	}

	public abstract void accept(ControllersVisitor controllersVisitor);

}
