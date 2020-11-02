package usantatecla.mastermind.models;

import java.util.ArrayList;
import java.util.List;

public class Registry {

	private List<Memento> mementos;
	private Game game;
	private int firstPrevious;

	public Registry(Game game) {
		this.mementos = new ArrayList<Memento>();
		this.game = game;
		this.firstPrevious = 0;
	}

	void registry() {
		for (int i = 0; i < this.firstPrevious; i++) {
			this.mementos.remove(0);
		}
		this.firstPrevious = 0;
		this.mementos.add(this.firstPrevious, this.game.createMemento());
	}

	public void undo() {
		this.firstPrevious++;
		this.game.recoverGame(this.mementos.get(this.firstPrevious));
	}

	public void redo() {
		this.firstPrevious--;
		this.game.recoverGame(this.mementos.get(this.firstPrevious));
	}

	public boolean undoable() {
		return this.firstPrevious < this.mementos.size() - 1;
	}

	public boolean redoable() {
		return this.firstPrevious >= 1;
	}

	void reset() {
		this.mementos = new ArrayList<Memento>();
		this.firstPrevious = 0;
	}

}
