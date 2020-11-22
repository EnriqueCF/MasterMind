package usantatecla.mastermind.views;

import usantatecla.mastermind.models.SecretCombination;
import usantatecla.utils.WithConsoleView;

public class SecretCombinationView extends WithConsoleView {
	
	public SecretCombinationView() {
		super();
	}
	
	public void writeln() {
		for (int i = 0; i < SecretCombination.getWidth(); i++) {
			this.console.write(MessageView.SECRET.getMessage());
		}
		this.console.writeln();
	}
	
}
