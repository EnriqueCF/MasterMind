package urjc.master.dcs.mastermind;

public class User extends Player {

	private Proposed proposedCombination;

	User() {
		this.proposedCombination = new Proposed();
	}

	public Proposed getProposedCombination() {
		return proposedCombination;
	}

	public void play(Board board) {
		this.proposedCombination = new Proposed();
		this.proposedCombination.read();
		board.add(this.proposedCombination);
	}
}
