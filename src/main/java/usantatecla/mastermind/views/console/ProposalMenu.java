package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.views.MessageView;
import usantatecla.utils.Menu;

public class ProposalMenu extends Menu{
	
	ProposalMenu(ProposalController controller){
		this.addCommand(new UndoCommand(MessageView.UNDO.toString(), controller));
		this.addCommand(new RedoCommand(MessageView.REDO.toString(), controller));
		this.addCommand(new ProposalCommand(MessageView.ACTION.toString(), controller));
	}
}
