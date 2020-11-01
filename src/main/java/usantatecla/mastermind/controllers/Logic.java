package usantatecla.mastermind.controllers;

import java.util.HashMap;
import java.util.Map;

import usantatecla.mastermind.models.Board;
import usantatecla.mastermind.models.State;
import usantatecla.mastermind.models.StateValue;

public class Logic {
	
	private State state;
		
	private Map<StateValue, Controller> controllers;
		
	public Logic() {
		this.state = new State();
		this.controllers = new HashMap<StateValue, Controller>();
		this.controllers.put(StateValue.INITIAL, new StartController(this.state));
		this.controllers.put(StateValue.IN_GAME, new ProposalController(this.state));
		this.controllers.put(StateValue.FINAL, new ResumeController(this.state));
		this.controllers.put(StateValue.EXIT, null);
	}
	
	public Controller getController() {
		return this.controllers.get(this.state.getValueState());
	}
	
}
