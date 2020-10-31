package urjc.master.dcs.mastermind.model;

import urjc.master.dcs.mastermind.utils.Console;

enum Match {
	SAME_COLOR("white"),
	SAME_POSITION("black"),
	NULL;
	
	private String message;

	Match(){
	}

	Match(String message){
		this.message = message;
	}

	void writeln() {
		if (this != Match.NULL){
			Console.instance().writeln(this.message);
		}
	}
	
	public boolean isNull() {
		return this == Match.NULL;
	}
}
