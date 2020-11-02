package usantatecla.mastermind.views;

import usantatecla.utils.WithConsoleView;

public class AttemptsView extends WithConsoleView {

	AttemptsView() {
	}

	void writeln(int attempts) {
		this.console.writeln(MessageView.ATTEMPTS.getMessage().replaceFirst("#attempts", "" + attempts));
	}

}
