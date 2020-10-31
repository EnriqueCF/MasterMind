package doo.mastermind.views;

import doo.mastermind.models.Board;

public class View {

	protected Board game;

	private StartView startView;

	private ProposalView proposalView;

	private ResumeView resumeView;

	public View(Board game) {
		this.game = game;
		this.startView = new StartView();
		this.proposalView = new ProposalView(this.game);
		this.resumeView = new ResumeView(this.game);
	}

	public void interact() {
		boolean newGame;
		do {
			this.startView.interact();
			boolean finished;
			do {
				finished = this.proposalView.interact();
			} while (!finished);
			newGame = this.resumeView.interact();
		} while (newGame);
	}

}
