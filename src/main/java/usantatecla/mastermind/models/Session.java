package usantatecla.mastermind.models;

import java.util.List;

import usantatecla.mastermind.types.Color;

public class Session {

	private State state;
	private Game game;
	private Registry registry;

	public Session() {
		this.state = new State();
		this.game = new Game();
		this.registry = new Registry(game);
	}

	public boolean isRedoable() {
		return this.registry.redoable();
	}

	public boolean isUndoable() {
		return this.registry.undoable();
	}

	public void redo() {
		this.registry.redo();
	}

	public void undo() {
		this.registry.undo();
	}

	public void next() {
		this.state.next();
	}

	public StateValue getValueState() {
		return this.state.getValueState();
	}

	public void newGame() {
		this.state = new State();
		this.game = new Game();
		this.registry = new Registry(game);
	}

	public boolean isWinner() {
		return this.game.isWinner();
	}

	public boolean isLooser() {
		return this.game.isLooser();
	}

	public void addProposedCombination(List<Color> colors) {
		this.game.addProposedCombination(colors);
		this.registry.registry();
	}
	
	public ProposedCombination getProposedCombination(int index) {
		return this.game.getProposedCombinations().get(index);
	}

	public List<Color> getColors(int position) {
		return this.game.getColors(position);
	}

	public int getBlacks(int position) {
		return this.game.getBlacks(position);

	}

	public int getAttempts() {
		return this.game.getAttempts();
	}

	public int getWhites(int position) {
		return this.game.getWhites(position);
	}
}
