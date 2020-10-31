package doo.mastermind.views.console;

import doo.mastermind.models.Result;
import doo.mastermind.views.MessageView;
import doo.utils.WithConsoleView;

class ResultView extends WithConsoleView {
	
	private Result result;

	ResultView(Result result) {
		this.result = result;
	}

	void writeln() {
		MessageView.RESULT.writeln(this.result.getBlacks(), this.result.getWhites());
	}

}
