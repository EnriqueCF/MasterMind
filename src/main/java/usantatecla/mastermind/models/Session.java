package usantatecla.mastermind.models;

public class Session {

	private Board board;
	private BoardRegistry registry;
	private State state;
	
	public Session() {
		this.state = new State();
		this.board = new Board();
	}
	
}
