package urjc.master.dcs.mastermind.model;

import urjc.master.dcs.mastermind.utils.Console;

public enum Error {
	WRONG_CHARACTERS, WRONG_LENGTH, NULL;

	private String message;

	Error() {
	}

	public void writeln() {
		if (this != Error.NULL) {
			Console.instance().writeln(this.message);
		}
	}

	public boolean isNull() {
		return this == Error.NULL;
	}
}
