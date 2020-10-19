package urjc.master.dcs.mastermind.model;

public class Row {
	public Proposed proposedCombination;
	public Feedback feedback;

	Row() {
		this.proposedCombination = new Proposed();
		this.feedback = new Feedback();
	}

	public Proposed getProposedCombination() {
		return proposedCombination;
	}

	public void setProposedCombination(Proposed proposedCombination) {
		this.proposedCombination = proposedCombination;
	}

	public Feedback getFeedback() {
		return feedback;
	}

	public void setFeedback(Feedback feedback) {
		this.feedback = feedback;
	}

}
