package usantatecla.mastermind.views;

public enum MessageView {
    EMPTY("-"), 
    SEPARATOR("-----------------------------------------------------"),
    VERTICAL_LINE_CENTERED(" | "),
	VERTICAL_LINE_LEFT("| "),
	PLAYER_WIN(" Player: You win!!! :-)"),
	PLAYER_LOST(" Player: You lost!!! :-("),
	START_GAME("-------------------- MASTERMIND --------------------"),
	READ_ROW("Row: "),
	READ_COLUMN("Column: "),
	ERROR("ERROR"),
	PROPOSE_COMMAND("Do a movement"), 
	UNDO_COMMAND("Undo previous movement"), 
	REDO_COMMAND("Redo previous movement"),
	ATTEMPTS("#attempts attempt(s): "),
	SECRET("*"),
	RESUME("Do you want to continue"),
	RESULT(" --> #blacks blacks and #whites whites"),
	PROPOSED_COMBINATION("Propose a combination: ");

	private String message;

	private MessageView(String message) {
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}

	public void write() {
		System.out.print(this.message);
	}
	
	public void writeln() {
		System.out.println(this.message);
	}
	
	public void writeln(int attempts) {
		System.out.println(this.message.replaceAll("#attempts", "" + attempts));
	}

	public void writeln(int blacks, int whites) {
		System.out.println(this.message.replaceFirst("#blacks", "" + blacks).replaceFirst("#whites", "" + whites));
	}

}
