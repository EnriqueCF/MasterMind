package urjc.master.dcs.mastermind.model;

public class Turn {

	private static final int NUMBER_PLAYERS = 2;
	private static final int MACHINE_PLAYER = 0;
	private static final int USER_PLAYER = 1;

	private Player[] players;

	public Turn(Board board) {
		this.players = new Player[NUMBER_PLAYERS];
		
		players[MACHINE_PLAYER] = new Machine();
		players[USER_PLAYER] = new User();
		this.players[MACHINE_PLAYER].play(board);
	}

	public void play(Board board) {
		this.players[USER_PLAYER].play(board);
		this.players[MACHINE_PLAYER].play(board);
	}

}
