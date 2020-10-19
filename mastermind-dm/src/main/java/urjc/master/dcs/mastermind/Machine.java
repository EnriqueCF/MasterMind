package urjc.master.dcs.mastermind;

public class Machine extends Player {

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
