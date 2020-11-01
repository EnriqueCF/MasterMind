package doo.mastermind.views.graphics;

import doo.mastermind.controllers.Logic;
import doo.mastermind.views.View;

public class ViewGraphics extends View {

	private StartView startView;
	private ProposalView proposalView;
	private ResumeView resumeView;

	public ViewGraphics(Logic logic) {
		this.startView = new StartView();
		this.proposalView = new ProposalView(logic);
		this.resumeView = new ResumeView(logic);
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
	protected boolean isFinished() {
		return this.resumeView.interact();
	}

}
