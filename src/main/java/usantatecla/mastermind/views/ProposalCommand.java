package usantatecla.mastermind.views;

import usantatecla.utils.Command;

public class ProposalCommand extends Command{

	public ProposalCommand() {
		super(MessageView.PROPOSE_COMMAND.toString());
	}

	@Override
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

}
