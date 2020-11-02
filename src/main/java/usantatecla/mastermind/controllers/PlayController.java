package usantatecla.mastermind.controllers;

import java.util.HashMap;
import java.util.Map;

import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.views.ProposalCommand;
import usantatecla.mastermind.views.RedoCommand;
import usantatecla.mastermind.views.UndoCommand;
import usantatecla.utils.Command;
import usantatecla.utils.Menu;

public class PlayController extends Controller{

	private Map<Command, Controller> controllers;
	private ProposalController proposalController;
	private RedoController redoController;
	private UndoController undoController;
	private ProposalCommand proposalCommand;
	private RedoCommand redoCommand;
	private UndoCommand undoCommand;
	private Menu menu;
	
	
	PlayController(Session session) {
		super(session);
		this.controllers = new HashMap<Command, Controller>();

		this.undoCommand = new UndoCommand();
		this.undoController = new UndoController(this.session);
		this.controllers.put(this.undoCommand, this.undoController);
		
		this.redoCommand = new RedoCommand();
		this.redoController = new RedoController(this.session);
		this.controllers.put(this.redoCommand, this.redoController);
		
		this.proposalCommand = new ProposalCommand();
		this.proposalController = new ProposalController(session);
		this.controllers.put(this.proposalCommand, this.proposalController);

		this.menu = new Menu(this.controllers.keySet());
		

	}

	@Override
	public void control() {
		this.proposalCommand.setActive(true);
		this.undoCommand.setActive(this.undoController.undoable());
		this.redoCommand.setActive(this.redoController.redoable());
		this.controllers.get(this.menu.execute()).control();
	}

}
