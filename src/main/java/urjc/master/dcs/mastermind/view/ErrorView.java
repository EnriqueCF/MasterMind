package urjc.master.dcs.mastermind.view;

import urjc.master.dcs.mastermind.model.Error;
import urjc.master.dcs.mastermind.utils.Console;

public class ErrorView {
	private static final String[] MESSAGES = { 
			"Repeated colors", 
			"Wrong proposed combination length" };
	private Error error;

	ErrorView(Error error) {
		this.error = error;
	}

	void writeln() {
		Console.instance().writeln(ErrorView.MESSAGES[this.error.ordinal()]);
	}
}
