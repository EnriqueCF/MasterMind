package doo.mastermind.views.console;

import doo.mastermind.controllers.Logic;
import doo.mastermind.views.View;

public class ViewConsole extends View {

	private StartView startView;
	private ProposalView proposalView;
	private ResumeView resumeView;

	public ViewConsole(Logic logic) {
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
