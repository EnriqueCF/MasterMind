package usantatecla.mastermind.views;

import usantatecla.utils.WithConsoleView;

public class StartView extends WithConsoleView {

	public void write() {
		this.console.writeln(MessageView.START_GAME.getMessage());
		new SecretCombinationView().writeln();
	}
}
