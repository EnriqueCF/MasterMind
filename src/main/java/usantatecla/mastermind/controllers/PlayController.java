package usantatecla.mastermind.controllers;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
	private Menu menu;
	
	
	PlayController(Session session) {
		super(session);
		this.proposalController = new ProposalController(session);
		this.redoController = new RedoController(session);
		this.undoController = new UndoController(session);
		Set<Command> commands = new HashSet<Command>();
		commands.add(new ProposalCommand());
		commands.add(new RedoCommand());
		commands.add(new UndoCommand());
		this.menu = new Menu(null);
	}

	@Override
	public void control() {
		// TODO Auto-generated method stub
		
	}

}
