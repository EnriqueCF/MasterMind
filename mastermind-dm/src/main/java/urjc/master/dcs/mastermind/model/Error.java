package urjc.master.dcs.mastermind.model;


public enum Error {
	WRONG_CHARACTERS,
	WRONG_LENGTH,
	NULL;
//	WRONG_CHARACTERS("Wrong colors, they must be: " + Color.getInitials()),
//	WRONG_LENGTH("Wrong proposed combination length"),
//	NULL;
//
//	private String message;
//
//	Error(){
//	}
//
//	Error(String message){
//		this.message = message;
//	}
//
//	void writeln() {
//		if (this != Error.NULL){
//			Console.instance().writeln(this.message);
//		}
//	}
//	
//	public boolean isNull() {
//		return this == Error.NULL;
//	}
}
