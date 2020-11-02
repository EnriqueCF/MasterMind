package usantatecla.mastermind.models;

import java.util.List;

import usantatecla.mastermind.types.Color;
import usantatecla.mastermind.types.Error;

public class Session {

	private Board board;
	private BoardRegistry registry;
	private State state;

	public Session() {
		this.state = new State();
		this.board = new Board();
		this.registry = new BoardRegistry(board);
	}

	public StateValue getValueState() {
		return this.state.getValueState();
	}

	public void next() {
		this.state.next();
	}

	public void reset() {
		this.board.clear();
		this.state.reset();
	}

	public boolean undoable() {
		return this.registry.isUndoable();
	}

	public void undo() {
		this.registry.undo();
	}
	
	
	public Error addProposedCombination(List<Color> colors) {
		Error error = this.board.addProposedCombination(colors);
		if (error == null){
			this.registry.register();
		}
		return error;	
	}

	public int getAttempts() {
		return this.board.getAttempts();
	}
	
	public Result getResult(int attempt) {
		return this.board.getResult(attempt);
	}

	public boolean isWinner() {
		return this.board.isWinner();
	}

	public boolean isLooser() {
		return this.board.isLooser();
	}

	public void redo() {
		this.registry.redo();
	}

	public boolean isRedoable() {
		return this.registry.isRedoable();
	}

	public List<Color> getColors(int position) {
		return this.board.getColors(position);
	}

	public int getWhites(int position) {
		return this.board.getWhites(position);
	}

	public int getBlacks(int position) {
		return this.board.getBlacks(position);
	}

	public int getWidth() {
		return this.board.getWidth();
	}
}
