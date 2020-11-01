package doo.mastermind.controllers;

import java.util.HashMap;
import java.util.Map;

import doo.mastermind.models.Board;
import doo.mastermind.models.State;
import doo.mastermind.models.StateValue;

public class Logic {

	private Board board;
	private State state;
	private Map<StateValue, Controller> controllers;

	public Logic() {
		this.board = new Board();
		this.state = new State();
		this.controllers = new HashMap<StateValue, Controller>();
		this.controllers.put(StateValue.IN_GAME, new PlayController(board, state));
		this.controllers.put(StateValue.RESUME, new FinishController(board, state));
		this.controllers.put(StateValue.EXIT, null);
	}

	public Controller getController() {
		return this.controllers.get(this.state.getValueState());
	}
}
