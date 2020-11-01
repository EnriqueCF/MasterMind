package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Board;
import usantatecla.mastermind.models.State;

public class ResumeController extends Controller {

	public ResumeController(Board board, State state) {
		super(board, state);
	}
	
	public void resume(boolean newboard) {
		if (newboard) {
			this.board.clear();
			this.state.reset();
		} else {
			this.state.next();
		}
	}

	@Override
	public void accept(ControllersVisitor controllersVisitor) {
		controllersVisitor.visit(this);
	}

}
