package urjc.master.dcs.mastermind.model;

public class Machine implements Player {

	private Secret secretCombination;

	public Machine() {
		this.setSecretCombination(new Secret());
	}

	public Secret getSecretCombination() {
		return this.secretCombination;
	}

	public void setSecretCombination(Secret secretCombination) {
		this.secretCombination = secretCombination;
	}
	
	public void play(Board board) {
		if(board.getSecret() == null) {
			board.addSecret(this.secretCombination);
		} else {
	
			Feedback feedback = new Feedback(board.getActualProposedCombination(), this.secretCombination);
			board.add(feedback);
		}
	}

}
