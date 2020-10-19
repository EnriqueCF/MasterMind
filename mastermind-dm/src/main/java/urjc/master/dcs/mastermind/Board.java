package urjc.master.dcs.mastermind;

import urjc.master.dcs.mastermind.utils.Console;

public class Board {
	private static final int MAX_ROWS = 10;

	private Row[] rows;
	private Secret secret;
	private int attempts;

	Board() {
		this.rows = new Row[MAX_ROWS];
		this.attempts = 0;
	}

	public void write() {
		Console.instance().writeln();
		Message.ATTEMPTS.writeln(this.attempts);
	}
	
	public void add(Proposed proposed) {
		this.rows[this.attempts] = new Row();
		this.rows[this.attempts].setProposedCombination(proposed);
	}
	
	public void add(Feedback feedback) {
		this.rows[this.attempts].setFeedback(feedback);
		this.attempts++;
	}

	public void addSecret(Secret secret) {
		this.secret = secret;
	}

	public Row[] getRows() {
		return rows;
	}

	public void setRows(Row[] rows) {
		this.rows = rows;
	}

	public Secret getSecret() {
		return secret;
	}

	public void setSecret(Secret secret) {
		this.secret = secret;
	}

	public int getAttempts() {
		return attempts;
	}

	public void setAttempts(int attempts) {
		this.attempts = attempts;
	}
	
	public boolean isCompleted() {
		return this.attempts >= MAX_ROWS || hasWinner();
	}
	
	public boolean hasWinner() {
		if(this.attempts==0) {
			return false;
		}
		
		return this.rows[this.attempts-1].getFeedback().hasWinner();		
	}

	public void writeln() {
	    Console.instance().writeln();
	    Message.ATTEMPTS.writeln(this.attempts);
	    this.secret.writeln();
	    for (int i = 0; i < this.attempts; i++) {
	    	this.rows[i].proposedCombination.write();
	    	this.rows[i].feedback.writeln();
	    }
	  }

	public Proposed getActualProposedCombination() {
		assert this.rows[this.attempts] != null;
		return this.rows[this.attempts].proposedCombination;
	}

}
