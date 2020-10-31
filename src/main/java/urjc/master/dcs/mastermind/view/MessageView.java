package urjc.master.dcs.mastermind.view;

import urjc.master.dcs.mastermind.utils.Console;

public enum MessageView {
	ATTEMPTS("#attempts attempt(s): "), SECRET("*"), RESUME("Do you want to continue"),
	RESULT(" --> #blacks blacks and #whites whites"), PROPOSED_COMBINATION("Propose a combination: "),
	TITLE("----- MASTERMIND -----"), WINNER("You've won!!! ;-)"), LOOSER("You've lost!!! :-(");

	private String message;

	private Console console;

	private MessageView(String message) {
		this.message = message;
	}

	public void write() {
		this.console.write(this.message);
	}

	public void writeln() {
		this.console.writeln(this.message);
	}

	public void writeln(int attempts) {
		this.console.writeln(this.message.replace("#attempts", "" + attempts));
	}

	public void writeln(int blacks, int whites) {
		this.console.writeln(this.message.replaceFirst("#blacks", "" + blacks).replaceFirst("#whites", "" + whites));
	}
}
