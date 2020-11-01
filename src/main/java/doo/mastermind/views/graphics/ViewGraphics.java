package doo.mastermind.views.graphics;

import doo.mastermind.controllers.FinishedController;
import doo.mastermind.controllers.PlayController;
import doo.mastermind.views.View;

public class ViewGraphics extends View {

	private StartView startView;
	private ProposalView proposalView;
	private ResumeView resumeView;

	public ViewGraphics(PlayController playController, FinishedController finishedController) {
		this.startView = new StartView();
		this.proposalView = new ProposalView(playController);
		this.resumeView = new ResumeView(finishedController);
	}

	@Override
	protected void start() {
		this.startView.interact();
	}

	@Override
	protected boolean play() {
		return this.proposalView.interact();
	}

	@Override
	protected boolean finished() {
		return this.resumeView.interact();
	}

}
