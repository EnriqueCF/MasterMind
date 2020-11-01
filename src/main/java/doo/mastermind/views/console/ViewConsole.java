package doo.mastermind.views.console;

import doo.mastermind.controllers.Controller;
import doo.mastermind.controllers.FinishController;
import doo.mastermind.controllers.PlayController;
import doo.mastermind.views.View;

public class ViewConsole extends View {

	private StartView startView;
	private ProposalView proposalView;
	private ResumeView resumeView;

	public ViewConsole() {
		this.startView = new StartView();
		this.proposalView = new ProposalView();
		this.resumeView = new ResumeView();
	}

	@Override
	public void interact(Controller controller) {
		if (controller instanceof PlayController) {
			this.proposalView.interact((PlayController) controller);
		} else {
			this.resumeView.interact((FinishController) controller);
		}
		
	}


}
