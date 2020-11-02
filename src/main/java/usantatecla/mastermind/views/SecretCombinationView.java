package usantatecla.mastermind.views;

import usantatecla.utils.WithConsoleView;

public class SecretCombinationView extends WithConsoleView {
	
	public SecretCombinationView() {
	}
	
	public void writeln(int length) {
		for (int i = 0; i < length; i++) {
			this.console.write(MessageView.SECRET.getMessage());
		}
		this.console.writeln();
	}
	
}
