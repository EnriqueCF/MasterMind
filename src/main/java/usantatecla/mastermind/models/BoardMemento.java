package usantatecla.mastermind.models;

public class BoardMemento {

	private Board board;
	
	public BoardMemento(Board board) {
		this.board = board.copy();
	}
	
	Board getBoard() {
		return this.board;
	}
}
