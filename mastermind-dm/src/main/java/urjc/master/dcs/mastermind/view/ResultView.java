package urjc.master.dcs.mastermind.view;

import urjc.master.dcs.mastermind.model.Result;
import urjc.master.dcs.mastermind.utils.WithConsoleView;

public class ResultView extends WithConsoleView {
	
	private Result result;

	ResultView(Result result) {
		this.result = result;
	}

	void writeln() {
		MessageView.RESULT.writeln(this.result.getBlacks(), this.result.getWhites());
	}
}
