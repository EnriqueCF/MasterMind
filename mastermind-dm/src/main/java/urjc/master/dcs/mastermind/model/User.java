package urjc.master.dcs.mastermind.model;

import urjc.master.dcs.mastermind.view.ProposedView;

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
		ProposedView proposedView = new ProposedView(this.proposedCombination);
		this.proposedView.read();
		board.add(this.proposedCombination);
	}
}
