package urjc.master.dcs.mastermind;

public class Turn {

	static final int NUMBER_PLAYERS = 2;
	static final int MACHINE = 0;
	static final int USER = 1;
	private Player[] players;

	Turn(Board board) {
		this.players = new Player[NUMBER_PLAYERS];
		players[0] = new Machine();
		players[1] = new User();
		this.players[0].play(board);
	}

	public void play(Board board) {
		this.players[1].play(board);
		this.players[0].play(board);
		 
	}

}
