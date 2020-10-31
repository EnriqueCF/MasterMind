package urjc.master.dcs.mastermind.model;

public class Board {
	private static final int MAX_ROWS = 10;
	private static final int INITIAL = 0;

	private Row[] rows;
	private Secret secret;
	private int attempts;

	public Board() {
		this.rows = new Row[MAX_ROWS];
		this.attempts = INITIAL;
	}

	public void add(Proposed proposed) {
		this.rows[this.attempts] = new Row();
		this.rows[this.attempts].setProposedCombination(proposed);
	}

	public void add(Feedback feedback) {
		this.rows[this.attempts].setFeedback(feedback);
		this.attempts++;
	}

	public boolean hasWinner() {
		return this.attempts == INITIAL 
				? Boolean.FALSE 
						: hasWinnerThisRow();
	}

	public Proposed getActualProposedCombination() {
		assert this.rows[this.attempts] != null;
		return this.rows[this.attempts].getProposedCombination();
	}

	public boolean isCompleted() {
		return this.attempts >= MAX_ROWS || hasWinner();
	}

	public void addSecret(Secret secret) {
		this.secret = secret;
	}

	public Row[] getRows() {
		return rows;
	}

	public Secret getSecret() {
		return secret;
	}

	public int getAttempts() {
		return attempts;
	}
	
	private boolean hasWinnerThisRow() {
		return this.rows[this.attempts - 1].getFeedback().hasWinner();
	}
}
