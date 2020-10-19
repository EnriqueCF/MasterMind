package urjc.master.dcs.mastermind;

import urjc.master.dcs.mastermind.utils.Console;

enum Error {
	DUPLICATED("Repeated colors"),
	WRONG_CHARACTERS("Wrong colors, they must be: " + Color.getInitials()),
	WRONG_LENGTH("Wrong proposed combination length"),
	NULL;

	private String message;

	Error(){
	}

	Error(String message){
		this.message = message;
	}

	void writeln() {
		if (this != Error.NULL){
			Console.instance().writeln(this.message);
		}
	}
	
	public boolean isNull() {
		return this == Error.NULL;
	}
}
