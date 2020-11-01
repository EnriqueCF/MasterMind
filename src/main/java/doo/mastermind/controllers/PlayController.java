package doo.mastermind.controllers;

import doo.mastermind.models.Board;
import doo.mastermind.models.ProposedCombination;
import doo.mastermind.models.Result;
import doo.mastermind.models.State;

public class PlayController extends Controller {


	PlayController(Board board, State state) {
		super(board, state);
	}

	public void addProposedCombination(ProposedCombination combination) {
		this.board.addProposedCombination(combination);
	}

	public int getAttempts() {
		return this.board.getAttempts();
	}

	public ProposedCombination getProposedCombination(int i) {
		return this.board.getProposedCombination(i);
	}

	public Result getResult(int i) {
		return this.board.getResult(i);
	}

	public boolean isWinner() {
		return this.board.isWinner();
	}

	public boolean isLooser() {
		return this.board.isLooser();
	}
}