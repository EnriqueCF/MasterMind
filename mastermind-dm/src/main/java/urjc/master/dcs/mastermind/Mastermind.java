package urjc.master.dcs.mastermind;

import urjc.master.dcs.mastermind.model.Game;
import urjc.master.dcs.mastermind.view.View;

public abstract class Mastermind {

	private Logic logic;
	private View view;
	
	private Mastermind() {
		this.game = new Logic();
		this.view = this.createView();
	}
	
	private void play() {
		this.view.interact();
	}
	
	public static void main(String[] args) {
		new Mastermind().play();
	}
}
