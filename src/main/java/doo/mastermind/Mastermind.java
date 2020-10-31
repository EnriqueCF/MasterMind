package doo.mastermind;

import doo.mastermind.models.Board;
import doo.mastermind.views.View;

public class Mastermind {

	private Board game;
	
	private View view;

	private Mastermind() {
		this.game = new Board();
		this.view = new View(this.game);
	}

	private void play() {
		this.view.interact();
	}
	
	public static void main(String[] args) {
		new Mastermind().play();
	}	

}
