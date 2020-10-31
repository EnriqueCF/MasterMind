package doo.mastermind.views.graphics;

import doo.mastermind.models.Board;
import doo.mastermind.views.View;

public class ViewGraphics extends View {

	private StartView startView;
	private ProposalView proposalView;
	private ResumeView resumeView;

	public ViewGraphics(Board board) {
		super(board);
		this.startView = new StartView();
		this.proposalView = new ProposalView(this.board);
		this.resumeView = new ResumeView(this.board);
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
