package urjc.master.dcs.mastermind.view;

import urjc.master.dcs.mastermind.model.Board;
import urjc.master.dcs.mastermind.utils.Console;

public class BoardView {

	private Board board;
	private SecretView secretView;
	
	public BoardView(Board board){
        this.board = board;
    }
	
	public void write() {
		Console.instance().writeln();
		MessageView.ATTEMPTS.writeln(this.board.getAttempts());
	}
	
	public void writeln() {
	    Console.instance().writeln();
	    int attemps = this.board.getAttempts();
	    MessageView.ATTEMPTS.writeln(attemps);	    
	    this.secretView.writeln();
	    
	    for (int i = 0; i < attempts; i++) {
	    	this.rows[i].proposedCombination.write();
	    	this.rows[i].feedback.writeln();
	    }
	  }

}
