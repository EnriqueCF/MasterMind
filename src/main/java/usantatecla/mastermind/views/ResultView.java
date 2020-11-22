package usantatecla.mastermind.views;

import usantatecla.utils.WithConsoleView;

public class ResultView extends WithConsoleView {

	public ResultView() {
		super();
	}

	public void writeln(int blacks, int whites) {
		this.console.writeln(MessageView.RESULT.getMessage().replaceFirst("#blacks", "" + blacks)
				.replaceFirst("#whites", "" + whites));
	}

}
