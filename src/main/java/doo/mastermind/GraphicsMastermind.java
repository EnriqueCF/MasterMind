package doo.mastermind;

import doo.mastermind.models.Board;
import doo.mastermind.views.View;
import doo.mastermind.views.graphics.ViewGraphics;

public class GraphicsMastermind {

	private Board game;
	
	private View view;

	private GraphicsMastermind() {
		this.game = new Board();
		this.view = new ViewGraphics(this.game);
	}

	private void play() {
		this.view.interact();
	}
	
	public static void main(String[] args) {
		new GraphicsMastermind().play();
	}
}
