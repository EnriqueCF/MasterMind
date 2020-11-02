package usantatecla.mastermind.models;

import java.util.ArrayList;
import java.util.List;

public class BoardRegistry {

	private List<BoardMemento> mementos;
	private Board board;
	private int firstPrevious;

	public BoardRegistry(Board board) {
		this.board = board;
		this.mementos = new ArrayList<BoardMemento>();
		this.firstPrevious = 0;
		this.mementos.add(this.firstPrevious, this.board.createMemento());
	}

	boolean isUndoable() {
		return this.firstPrevious < this.mementos.size() - 1;
	}

	boolean isRedoable() {
		return this.firstPrevious >= 1;
	}

	void redo() {
		this.firstPrevious--;
		this.board.set(this.mementos.get(this.firstPrevious));
	}

	void undo() {
		this.firstPrevious++;
		this.board.set(this.mementos.get(this.firstPrevious));
	}

	void register() {
		for (int i = 0; i < this.firstPrevious; i++) {
			this.mementos.remove(0);
			this.firstPrevious--;
		}
		this.mementos.add(this.firstPrevious, this.board.createMemento());
	}
}
