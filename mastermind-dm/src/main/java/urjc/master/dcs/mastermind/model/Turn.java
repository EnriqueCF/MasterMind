package urjc.master.dcs.mastermind.model;

public class Turn {

	static final int NUMBER_PLAYERS = 2;
	static final int MACHINE = 0;
	static final int USER = 1;
	private Player[] players;

	Turn(Board board) {
		this.players = new Player[NUMBER_PLAYERS];
		players[MACHINE] = new Machine();
		players[USER] = new User();
		this.players[MACHINE].play(board);
	}

	public void play(Board board) {
		this.players[USER].play(board);
		this.players[MACHINE].play(board);
		 
	}

}
