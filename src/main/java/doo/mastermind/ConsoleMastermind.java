package doo.mastermind;

import doo.mastermind.models.Board;
import doo.mastermind.views.View;
import doo.mastermind.views.console.ViewConsole;

public class ConsoleMastermind {
	private Board game;

	private View view;

	private ConsoleMastermind() {
		this.game = new Board();
		this.view = new ViewConsole(this.game);
	}

	private void play() {
		this.view.interact();
	}

	public static void main(String[] args) {
		new ConsoleMastermind().play();
	}
}
