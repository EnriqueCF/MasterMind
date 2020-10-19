package urjc.master.dcs.mastermind.view;

import urjc.master.dcs.mastermind.model.Board;

public class View {

	protected Board board;
	
	private StartView startView;
	
	public BoardView boardView;
	
	public View(Board board) {
		this.board = board;
		this.startView = new StartView();
	}
}
